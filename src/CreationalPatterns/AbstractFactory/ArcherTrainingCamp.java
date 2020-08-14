package CreationalPatterns.AbstractFactory;

public class ArcherTrainingCamp implements TrainingCamp {
    private static EquipFactory factory = new ArcherEquipFactory();

    @Override
    public Adventurer trainAdventurer() {
        System.out.println("Train an archer");
        Archer archer = new Archer();

        archer.weapon = factory.productWeapon();
        archer.clothes = factory.productArmor();
        return archer;
    }
}
