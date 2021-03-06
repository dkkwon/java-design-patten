package iterator;

import java.util.*;

public abstract class MenuComponent {
    // For Composite Pattern
	public void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	public void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
  
    // For Pizza
	public String getName() {
		throw new UnsupportedOperationException();
	}
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	public double getPrice() {
		throw new UnsupportedOperationException();
	}
	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}

	// MenuComponet 에 대한 Iterator
	public abstract Iterator<MenuComponent> createIterator();

	public void print() {
		throw new UnsupportedOperationException();
	}    
}