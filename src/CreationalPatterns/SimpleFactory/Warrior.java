package CreationalPatterns.SimpleFactory;

public class Warrior implements  Adventurer {

    @Override
    public String getType() {
        System.out.println("I'm a warrior");
        return this.getClass().getSimpleName();
    }
}