package strategyduck;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
 
		DuckMallard	mallard = new DuckMallard();
		// labmda expression
		FlyBehavior cantFly = () -> System.out.println("I can't fly");
		QuackBehavior squeak = () -> System.out.println("Squeak");
		DuckRubber	rubberDuckie = new DuckRubber(cantFly, squeak);
		DuckDecoy	decoy = new DuckDecoy();
 
		Duck	 model = new DuckModel();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();
   
		model.performFly();	
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
