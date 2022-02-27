import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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




    public Unit getRandomUnit(){
        Random rand = new Random();
        return units.get(rand.nextInt(units.size()));
    }



}
