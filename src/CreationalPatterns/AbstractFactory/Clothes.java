package CreationalPatterns.AbstractFactory;

public abstract class Clothes {
    protected int def;

    public void display() {
        System.out.println(this.getClass().getSimpleName() + "def = " + def);
    }
}