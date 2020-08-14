package CreationalPatterns.AbstractFactory;

public class Warrior extends Adventurer {
    @Override
    public void display() {
        System.out.println("I'm a warrior, equip: ");
        weapon.display();
        System.out.println();
        clothes.display();
        System.out.println();
    }
}
