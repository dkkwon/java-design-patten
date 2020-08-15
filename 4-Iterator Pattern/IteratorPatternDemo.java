// https://www.javatpoint.com/iterator-pattern

import java.util.*;

public class IteratorPatternDemo {
	
	public static void main(final String[] args) {
		CollectionofNames cmpnyRepository = new CollectionofNames();

		for (final Iterator<String> iter = cmpnyRepository.createIterator(); iter.hasNext();) {
			final String name = (String) iter.next();
	          System.out.println("Name : " + name);
	       } 	
	      
	}
}