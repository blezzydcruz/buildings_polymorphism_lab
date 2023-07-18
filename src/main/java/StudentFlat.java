public class StudentFlat extends Building implements Rentable{

    private int numberOfPartiesHosted;

    public StudentFlat(int numberOfRooms, String dateOfConstruction, int numberOfPartiesHosted) {
        super(numberOfRooms, dateOfConstruction);
        this.numberOfPartiesHosted = numberOfPartiesHosted;
    }

    public int getNumberOfPartiesHosted() {
        return numberOfPartiesHosted;
    }

    @Override
    public String noisyNeighbourhood() {
        return "SO NOISY!";
    }

    // ABSTRACT METHOD
    @Override
    public double calculateArea() {
        return 0;
    }

    // IMPLEMENTING INTERFACE METHOD
    public String rent(int rentPayment) {
        return "A room is up for up for rent for £" + rentPayment + " per month.";
    }
}
