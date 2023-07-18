public class Office extends Building {

    private String name;

    public Office(int numberOfRooms, String dateOfConstruction, String companyName) {
        super(numberOfRooms, dateOfConstruction);
        this.name = companyName;
    }

    public String getCompanyName() {
        return name;
    }

    @Override
    public String noisyNeighbourhood() {
        return "Noisy but Office is soundproofed";
    }

    // ABSTRACT METHOD
    @Override
    public double calculateArea() {
        return 0;
    }
}
