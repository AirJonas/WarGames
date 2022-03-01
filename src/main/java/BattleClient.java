public class BattleClient {


  public static void main(String[] args) {
    Army armyOne = new Army("Human army");
    Army armyTwo = new Army("orc army");

    for(int i = 0; i<500; i++){
      InfantryUnit infantryUnit = new InfantryUnit("Footman", 100);
      armyOne.addUnit(infantryUnit);
    }

    for(int i = 0; i<100; i++){
      CavalryUnit cavalryUnit  = new CavalryUnit("Knight", 100);
      armyOne.addUnit(cavalryUnit);
    }

    for(int i = 0; i<200; i++){
      RangedUnit rangedUnit  = new RangedUnit("Archer", 100);
      armyOne.addUnit(rangedUnit);
    }

    CommanderUnit commanderUnit  = new CommanderUnit("Mountain King", 180);
    armyOne.addUnit(commanderUnit);

    for(int i = 0; i<500; i++){
      InfantryUnit infantryUnit = new InfantryUnit("Grunt", 100);
      armyTwo.addUnit(infantryUnit);
    }

    for(int i = 0; i<100; i++){
      CavalryUnit cavalryUnit  = new CavalryUnit("Raider", 100);
      armyTwo.addUnit(cavalryUnit);
    }

    for(int i = 0; i<200; i++){
      RangedUnit rangedUnit  = new RangedUnit("Spearman", 100);
      armyTwo.addUnit(rangedUnit);
    }

    CommanderUnit commanderUnit1  = new CommanderUnit("GulDan", 180);
    armyTwo.addUnit(commanderUnit1);

    Battle battle = new Battle(armyOne, armyTwo);
    System.out.println(battle.simulate().getName() + " won");
  }

}
