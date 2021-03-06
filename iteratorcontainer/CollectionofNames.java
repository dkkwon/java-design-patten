
// https://www.javatpoint.com/iterator-pattern

package iteratorcontainer;

import java.util.*;

public class CollectionofNames implements Container {

	 public String name[]={"Ashwani Rajput", "Soono Jaiswal","Rishi Kumar","Rahul Mehta","Hemant Mishra"}; 
	
	 public int age[]={26, 25,24,25,23}; 
		
	 public String address[]={"New Delhi", "Gaziabad","Rishi Kumar","Rahul Mehta","Hemant Mishra"}; 
	 
	 public String designation[]={"Java Programmer and Content Writer", "CEO","Programmer and Web Designer","Manager",".Net Trainer"};
		
	
	@Override
	public Iterator<String> createIterator() {
		
		return new CollectionofNamesIterate() ;
	}
	
	
	private class CollectionofNamesIterate implements Iterator<String> {
		
		int i;

		@Override
		public boolean hasNext() {
			if (i<name.length){
				return true;
			}
			return false;
		}

		@Override
		public String next() {
			if(this.hasNext()){
	            return name[i++];
			}
		    return null;	
		}
	
	}
}


