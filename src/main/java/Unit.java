/**
 *  Represent a unit of the war game
 *  Functionality of the class unit is to create unit and
 *  to get information of the unit
 *  It is an abstract class
 *
 * @author Aironas
 */
public abstract class Unit {
    private String name;
    private int health;
    private int attack;
    private int armor;

    /**
     * Creates an instance of the Unit.
     *
     * @param name of a unit.
     * @param health how much health unit have.
     * @param attack how much attack unit have.
     * @param armor how much armor unit have.
     */
    public Unit(String name, int health, int attack, int armor){
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.armor = armor;
    }

    /**
     * method to attack other unit(opponent)
     *
     * @param oponent unit that other unit attacks
     */
    public void attack(Unit oponent){

        int newHealth = oponent.getHealth()
                - (this.attack + this.getAttackBonus())
                + (oponent.getArmor() + oponent.getResistBonus());
        oponent.setHealth(newHealth);

    }

    /**
     * returns the name of the unit
     *
     * @return name if the unit
     */
    public String getName(){
        return this.name;
    }

    /**
     * returns the value health of the unit
     *
     * @return value health of the unit
     */
    public int getHealth(){
        return this.health;
    }

    /**
     * returns attack value of the unit
     *
     * @return attack value of the unit
     */
    public int getAttack(){
        return this.attack;
    }

    /**
     * returns value of the armor unit have
     *
     * @return armor value of the unit
     */
    public int getArmor(){
        return this.armor;
    }

    /**
     * set health of the unit
     *
     * @param health of the unit
     */
    public void setHealth(int health) {
        if(health >= 0) {
            this.health = health;
        } else {
            this.health = 0;
        }
    }

    /**
     * Returns attack-bonus of the unit
     * depending on what kind of type the unit is
     *
     * @return attack-bonus as int
     */
    public abstract int getAttackBonus();

    /**
     * Returns resist-bonus of the unit
     * depending on what kind of type the unit is
     * @return resist-bonus as int
     */
    public abstract int getResistBonus();
}
