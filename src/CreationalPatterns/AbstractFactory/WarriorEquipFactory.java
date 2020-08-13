package CreationalPatterns.AbstractFactory;

public class WarriorEquipFactory implements EquipFactory {
    @Override
    public Weapon productWeapon() {
        LongSword product = new LongSword();
        product.atk = 10;
        product.range = 1;
        return product;
    }

    @Override
    public Clothes productArmor() {
        Armor product = new Armor();
        product.def = 10;
        return product;
    }
}
