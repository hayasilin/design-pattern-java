package CreationalPatterns.SimpleFactory;

public class Archer implements Adventurer {

    @Override
    public String getType() {
        System.out.println("I'm a archer");
        return this.getClass().getSimpleName();
    }
}