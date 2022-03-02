import java.util.Random;

public class Battle {
    private Army armyOne;
    private Army armyTwo;

    public Battle(Army armyOne, Army armyTwo){
        this.armyOne = armyOne;
        this.armyTwo = armyTwo;
    }

    public Army simulate(){
        Army victor;
        Random rand = new Random();
        while(armyOne.hasUnits() && armyTwo.hasUnits()){
            Unit attacker = armyOne.getRandomUnit();
            Unit defender = armyTwo.getRandomUnit();
            if (rand.nextBoolean()) {
                attacker.attack(defender);
            } else {
                defender.attack(attacker);
            }

            if(defender.getHealth() <= 0){
                armyTwo.remove(defender);
            }

            if(attacker.getHealth() <= 0){
                armyOne.remove(attacker);
            }
            }

        if (armyOne.hasUnits()){
            victor = armyOne;
        } else {
            victor = armyTwo;
        }
        return victor;
    }

}
