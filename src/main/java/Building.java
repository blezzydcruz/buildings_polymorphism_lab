public abstract class Building {

    protected int numberOfRooms;
    protected String dateOfConstruction;

    public Building(int numberOfRooms,String dateOfConstruction) {
        this.numberOfRooms = numberOfRooms;
        this.dateOfConstruction = dateOfConstruction;
    }

    public String noisyNeighbourhood() {
        return "No noise";
    }

    // ABSTRACT METHOD
    public abstract double calculateArea();

}
