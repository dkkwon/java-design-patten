package strategyduck;

public class DuckDecoy extends Duck {
	public DuckDecoy() {
		System.out.println("DuckModel");
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new QuackMute());
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
