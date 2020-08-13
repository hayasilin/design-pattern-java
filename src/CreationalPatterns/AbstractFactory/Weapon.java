package CreationalPatterns.AbstractFactory;

public abstract class Weapon {
    protected int atk;
    protected int range;

    public void display() {
        System.out.println(this.getClass().getSimpleName() + " atk = " + atk + " , range = " + range);
    }
}
