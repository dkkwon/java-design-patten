package iterator;

import java.util.*;

public class Menu extends MenuComponent {
	Iterator<MenuComponent> iterator = null;
    ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    String name;
    String description;
    
    public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}
 
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}
 
	public MenuComponent getChild(int i) {
		return menuComponents.get(i);
	}
 
	public String getName() {
		return name;
	}
 
	public String getDescription() {
		return description;
	}
 
	public Iterator<MenuComponent> createIterator() {
		if (iterator == null) {
			// menuComponents.iterator() : ArrayList 에서 Iterator 인터페이스 구현되어 있음
			iterator = new CompositeIterator(menuComponents.iterator());
		}
		return iterator;
	}

	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");
	}
}