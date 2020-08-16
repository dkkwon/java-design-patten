package strategyduck;

public class DuckModel extends Duck {
	public DuckModel() {
		System.out.println("DuckModel");
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
