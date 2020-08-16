package strategyduck;

public class DuckMallard extends Duck {

	public DuckMallard() {
		System.out.println("DuckModel");
		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new Quack());
	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
