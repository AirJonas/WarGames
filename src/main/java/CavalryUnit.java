/**
 * represents cavalry unit. cavalry unit have 20 attack and 12 armor
 * also have attack bonus 6 on first attack afterwards is made to 2
 * and resist bonus of 1.
 *
 * @author Aironas
 */
public class CavalryUnit extends Unit {
    private boolean isFirstAttack = true;

    public CavalryUnit(String name, int health){
        super(name, health, 20, 12);
    }

    protected CavalryUnit(String name, int health, int attack, int armor){
        super(name, health, attack, armor);
    }

    @Override
    public int getAttackBonus() {
        int attackBonus = 0;
        if(isFirstAttack == true){
            attackBonus = 6;
            isFirstAttack = false;
        } else {
            attackBonus = 2;
        }
        return attackBonus;
    }

    @Override
    public int getResistBonus() {
        return 1;
    }
}
