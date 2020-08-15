package adapter;

public class TestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.quack();         
        duck.fly();
        Turkey turkey = new WildTurkey();
        turkey.gobble();         
        turkey.fly();

        Duck adaptedDuck = new TurkeyAdapter(turkey);
        adaptedDuck.quack();
        adaptedDuck.fly();
        Turkey adaptedTurkey = new DuckAdapter(duck);
        adaptedTurkey.gobble();
        adaptedTurkey.fly();
    }
}