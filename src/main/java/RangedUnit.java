public class RangedUnit extends Unit{

    RangedUnit(String name, int health, int attack, int armor){
        super(name, health, 15, 5);
    }

    @Override
    public int getAttackBonus() {
        return 3;
    }

    @Override
    public int getResistBonus() {
        return 8;
    }
}

