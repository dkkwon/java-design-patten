// https://www.javatpoint.com/iterator-pattern
package iteratorcontainer;

import java.util.*;

public interface Container {

	public Iterator<String> createIterator();
	
}
