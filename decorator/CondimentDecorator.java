package decorator;

public abstract class CondimentDecorator extends Beverage {
	Beverage beverage;

	public CondimentDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	public abstract String getDescription();

	// abstract class를 abstract class 로 상속시 필요없으나, 가독성을 위해
	public abstract double cost();
}
