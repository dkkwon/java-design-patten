package iterator;

import java.util.Iterator;
  
public class Waitress {
	MenuComponent menu;
 
	public Waitress(MenuComponent menu) {
		this.menu = menu;
	}
 
	public void printMenu() {
		menu.print();
		Iterator<MenuComponent> iterator = menu.createIterator();

		while (iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			menuComponent.print();
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
