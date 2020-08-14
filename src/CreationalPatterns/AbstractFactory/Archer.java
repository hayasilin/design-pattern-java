package CreationalPatterns.AbstractFactory;

public class Archer extends Adventurer {
    @Override
    public void display() {
        System.out.println("I'm an archer, equip: ");
        weapon.display();
        System.out.println();
        clothes.display();
        System.out.println();
    }
}
