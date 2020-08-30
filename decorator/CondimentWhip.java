package decorator;

public class CondimentWhip extends CondimentDecorator {
	public CondimentWhip(Beverage beverage) {
		super(beverage);
		// Auto-generated constructor stub
	}

	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}
