package decorator;

public abstract class Beverage {
	String description = "Unknown Beverage";
  
	// interface 를 이용한 decorator pattern 구현

	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}
