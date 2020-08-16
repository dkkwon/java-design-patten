package strategyduck;

public class DuckRubber extends Duck {

	public DuckRubber() {
		System.out.println("DuckRubber");
		flyBehavior = new FlyNoWay();
		// quackBehavior = new QuackSqueak();
		// quackBehavior = () -> System.out.println("Squeak");
		setQuackBehavior(new QuackBehavior(){
			public void quack() {
				System.out.println("Squeak");
			}
		});
	}

	public DuckRubber(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		System.out.println("DuckRubber");
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior;
	}

	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
