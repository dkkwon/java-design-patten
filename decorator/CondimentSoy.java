package decorator;

public class CondimentSoy extends CondimentDecorator {
	public CondimentSoy(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		return .15 + beverage.cost();
	}
}
