package iterator;

import java.util.Iterator;
  
public class Waitress {
	MenuComponent menu;
 
	public Waitress(MenuComponent menu) {
		this.menu = menu;
	}
 
	public void printMenu() {
		Iterator<MenuComponent> iterator = menu.createIterator();

		System.out.println("\n MENU\n----");
		while (iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			try {
					menuComponent.print();
			} catch (UnsupportedOperationException e) {}
		}
	}
  
	public void printVegetarianMenu() {
		Iterator<MenuComponent> iterator = menu.createIterator();

		System.out.println("\nVEGETARIAN MENU\n----");
		while (iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			try {
				if (menuComponent.isVegetarian()) {
					menuComponent.print();
				}
			} catch (UnsupportedOperationException e) {}
		}
	}
}
