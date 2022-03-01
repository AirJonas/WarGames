public class Battle {
    private Army armyOne;
    private Army armyTwo;

    public Battle(Army armyOne, Army armyTwo){
        this.armyOne = armyOne;
        this.armyTwo = armyTwo;
    }

    public Army simulate(){
        Army victor;
        while(armyOne.hasUnits() && armyTwo.hasUnits()){
            Unit attacker = armyOne.getRandomUnit();
            Unit defender = armyTwo.getRandomUnit();
            attacker.attack(defender);
            if(defender.getHealth() <= 0){
                armyTwo.remove(defender);
            }

            attacker = armyTwo.getRandomUnit();
            defender = armyOne.getRandomUnit();
            attacker.attack(defender);
            if(defender.getHealth() <= 0){
                armyOne.remove(defender);
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
