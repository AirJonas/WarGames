/**
 * represents Commander unit. commander unit have attack 25 and armor 12
 * also attack bonus and resist bonus is the same as cavalry unit
 */
public class CommanderUnit extends CavalryUnit {
    public CommanderUnit(String name, int health) {
        super(name, health, 25, 15);
    }
}
