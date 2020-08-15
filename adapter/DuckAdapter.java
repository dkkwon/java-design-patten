package adapter;

public class DuckAdapter implements Turkey {
    Duck duck;

    public DuckAdapter(Duck duck){
        this.duck = duck;
    }

    private void printAdatpor() {
        System.out.print("DuckAdapter - ");
    }

    @Override
    public void gobble() {
        printAdatpor();
        duck.quack();
    }

    @Override
    public void fly() {
        printAdatpor();
        duck.fly();
    }
    
}