package strategyduck;

public class DuckRedHead extends Duck {
 
	public DuckRedHead() {
		System.out.println("DuckRedHead");
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
