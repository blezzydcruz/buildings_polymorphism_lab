public class Bungalow extends Building {

    private boolean centralHeating;

    public Bungalow(int numberOfRooms, String dateOfConstruction, boolean centralHeating) {
    super(numberOfRooms, dateOfConstruction);
    this.centralHeating = centralHeating;
    }

    public boolean hasCentralHeating() {
        return centralHeating;
    }

    @Override
    public String noisyNeighbourhood() {
        return "So quiet";
    }

    // OVERLOAD METHOD
    public String noisyNeighbourhood(String message) {
        return "I think the neighbourhood is " + message + ".";
    }

    // ABSTRACT METHOD
    @Override
    public double calculateArea() {
        return 0;
    }
}
