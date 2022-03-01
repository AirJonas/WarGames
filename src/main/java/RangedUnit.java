/**
 * Represents Ranged unit. Ranged unit have 15 attack and 5 armor
 * also have attack bonus of 3 and resist bonus
 * from 6 and get smaller by 2 each time its get attacked to minimum value of 2
 *
 * @author Aironas
 */
public class RangedUnit extends Unit {
  private int attackCount = 0;

  RangedUnit(String name, int health) {
    super(name, health, 15, 5);

  }

  @Override
  public int getAttackBonus() {
    return 3;
  }

  @Override
  public int getResistBonus() {
    int ressistBonus;
    if (attackCount == 0) {
      ressistBonus = 6;
    } else {
      if (attackCount == 1) {
        ressistBonus = 4;
      } else {
        ressistBonus = 2;
      }
    }
    return ressistBonus;
  }
}

