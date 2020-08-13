package CreationalPatterns.AbstractFactory;

public class ArcherEquipFactory implements EquipFactory {
    @Override
    public Weapon productWeapon() {
        Bow product = new Bow();
        product.atk = 10;
        product.range = 10;
        return product;
    }

    @Override
    public Clothes productArmor() {
        Leather product = new Leather();
        product.def = 5;
        return product;
    }
}
