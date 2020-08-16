package observersimple;

public class Example {

	public static void main(String[] args) {
		SimpleSubject simpleSubject = new SimpleSubject();
		SimpleObserver simpleObserver = new SimpleObserver();
		
		simpleSubject.registerObserver(simpleObserver);
		
		simpleSubject.setValue(80);
		simpleSubject.setValue(100);
	}
}
