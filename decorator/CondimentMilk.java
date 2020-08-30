package decorator;

public class CondimentMilk extends CondimentDecorator {
	public CondimentMilk(Beverage beverage) {
		super(beverage);
		// Auto-generated constructor stub
	}

	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}
