/**
 * Represent an infantry unit. infantry unit have 15 attack and 10 armor
 * also have attack bonus of 2 and resist bonus of 1
 *
 * @author Aironas
 */
public class InfantryUnit extends Unit{

    InfantryUnit(String name, int health){
        super(name, health, 15, 10);
    }

    @Override
    public int getAttackBonus() {
        return 2;
    }

    @Override
    public int getResistBonus() {
        return 1;
    }
}
