package adapter;

public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    private void printAdatpor() {
        System.out.print("TurkeyAdapter - ");
    }

    @Override
    public void quack() {
        printAdatpor();
        turkey.gobble();
    }

    @Override
    public void fly() {
        printAdatpor();
        turkey.fly();
    }
    
}