package myducks;

public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("WildTurkey Quack");
    }

    @Override
    public void fly() {
        System.out.println("WildTurkey Fly");
    }
    
}