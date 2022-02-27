import java.util.ArrayList;
import java.util.List;

public class Army {
    private String name;
    private List<Unit> units;

    public Army(String name){
        this.units = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addUnit(Unit unit){
        this.units.add(unit);
    }

    public void addAll(List<Unit> units){
        //???????
    }
    public void remove(Unit unit){
        this.units.remove(unit);
    }

    public boolean hasUnits(){
        boolean hasUnits = true;
        if (this.units.isEmpty() == true){
            hasUnits = false;
        }
        return hasUnits;
    }
}
