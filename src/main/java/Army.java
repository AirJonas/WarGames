import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * represents army of the units using arraylist to hold all units
 *
 * @author Aironas
 */
public class Army {
    private String name;
    private List<Unit> units;
    private Random rand = new Random();

    /**
     * Creates instance of the army as an arraylist
     * of the parameter Units
     *
     * @param name of the army
     */
    public Army(String name){
        this.units = new ArrayList<>();
    }

    /**
     * returns name of the army
     * @return name of the army
     */
    public String getName() {
        return name;
    }

    /**
     * add a unit to the arraylist that hold Units
     * @param unit a unit
     */
    public void addUnit(Unit unit){
        this.units.add(unit);
    }

    /**
     * Add list of Unit parameters in an arraylist
     * @param units list that hold Unit
     */
    public void addAll(List<Unit> units){
        this.units.addAll(units);
    }

    /**
     * removes a unit from the list
     * @param unit a unit
     */
    public void remove(Unit unit){
        this.units.remove(unit);
    }

    /**
     * checks if the list have units in the list and
     * returns falls if it has not and true if it has
     * @return falls or true
     */
    public boolean hasUnits(){
        boolean hasUnits = true;
        if (this.units.isEmpty() == true){
            hasUnits = false;
        }
        return hasUnits;
    }

    /**
     * gets random unit from a list and returns it
     * @return Unit from the list
     */
    public Unit getRandomUnit(){
        return units.get(this.rand.nextInt(units.size()));
    }



}
