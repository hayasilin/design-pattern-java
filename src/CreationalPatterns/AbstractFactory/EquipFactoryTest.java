package CreationalPatterns.AbstractFactory;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EquipFactoryTest {
    private EquipFactory equipFactory;

    @Test
    public void equipFactoryTest() {
        equipFactory = new ArcherEquipFactory();
        Clothes archerLeather = equipFactory.productArmor();
        Weapon archerBow = equipFactory.productWeapon();

        assertEquals(5, archerLeather.def);
        assertEquals(10, archerBow.atk);
        assertEquals(10, archerBow.range);

        equipFactory = new WarriorEquipFactory();
        Clothes armor = equipFactory.productArmor();
        Weapon longSword = equipFactory.productWeapon();

        assertEquals(10, armor.def);
        assertEquals(10, longSword.atk);
        assertEquals(1, longSword.range);

        TrainingCamp camp = new ArcherTrainingCamp();
        Adventurer archer = camp.trainAdventurer();

        camp = new WarriorTrainingCamp();
        Adventurer warrior = camp.trainAdventurer();

        archer.display();
        warrior.display();
    }
}
