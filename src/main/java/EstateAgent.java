import java.util.ArrayList;

public class EstateAgent {

    private ArrayList<Building> buildings;

    public EstateAgent() {
        this.buildings = new ArrayList<>();
    }

    public int countBuildings() {
        return this.buildings.size();
    }

    public void addBuildings(Building building) {
        this.buildings.add(building);
    }

}
