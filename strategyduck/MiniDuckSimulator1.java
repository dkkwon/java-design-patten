package strategyduck;

public class MiniDuckSimulator1 {
 
	public static void main(String[] args) {
 
		Duck mallard = new DuckMallard();
		mallard.performQuack();
		mallard.performFly();
   
		Duck model = new DuckModel();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

		Duck rubber = new DuckRubber();
		rubber.performQuack();
		rubber.performFly();

		Duck rubber2 = new DuckRubber(new FlyWithWings(), new QuackFake());
		rubber2.performQuack();
		rubber2.performFly();

	}
}
