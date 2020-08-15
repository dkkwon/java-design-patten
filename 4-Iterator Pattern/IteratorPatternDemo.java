// https://www.javatpoint.com/iterator-pattern

import java.util.*;

public class IteratorPatternDemo {
	
	public static void main(String[] args) {
	      
	      for(Iterator<String> iter = cmpnyRepository.createIterator(); iter.hasNext();){
	          String name = (String)iter.next();
	          System.out.println("Name : " + name);
	       } 	
	      
	}
}