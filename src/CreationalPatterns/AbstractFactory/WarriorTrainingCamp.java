package CreationalPatterns.AbstractFactory;

public class WarriorTrainingCamp implements TrainingCamp {
    private static EquipFactory factory = new WarriorEquipFactory();

    @Override
    public Adventurer trainAdventurer() {
        System.out.println("Train a warrior");
        Warrior warrior = new Warrior();

        warrior.weapon = factory.productWeapon();
        warrior.clothes = factory.productArmor();
        return warrior;
    }
}
