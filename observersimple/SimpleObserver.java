package observersimple;
	
public class SimpleObserver implements Observer {
	private int value;
	
	public void update(int value) {
		this.value = value;
		display();
	}
	
	public void display() {
		System.out.println("Value: " + value);
	}
}
