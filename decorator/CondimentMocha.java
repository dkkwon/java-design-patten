package decorator;

public class CondimentMocha extends CondimentDecorator {
 
	public CondimentMocha(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}

	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
 
	public double cost() {
		return .20 + beverage.cost();
	}
}
