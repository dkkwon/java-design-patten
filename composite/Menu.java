package composite;

import java.util.*;

public class Menu extends MenuComponent {
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
 
	// print 역할과 recursive 순회하는 역할이 분리되지 않음
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");

			
		for (MenuComponent menuComponent: menuComponents) {	
			// recursive 하게 하위 항목을 찾게 한다
			menuComponent.print();
		}
	}
}