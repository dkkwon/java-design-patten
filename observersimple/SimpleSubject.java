package observersimple;

import java.util.*;

public class SimpleSubject implements Subject {
	// List Collection ?
	private List<Observer> observers;
	private int value = 0;
	
	public SimpleSubject() {
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	// Observer interface 를 구현한 observers의 구현된 update() 호출 
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(value);
		}
	}
	
	public void setValue(int value) {
		this.value = value;
		notifyObservers();
	}
}