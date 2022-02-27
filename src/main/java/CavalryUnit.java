public class CavalryUnit extends Unit {

    CavalryUnit(String name, int health, int attack, int armor){
        super(name, health, 20, 12);
    }
    @Override
    public int getAttackBonus() {
        return 4;
    }

    @Override
    public int getResistBonus() {
        return 1;
    }
}
