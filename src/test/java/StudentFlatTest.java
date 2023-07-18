import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StudentFlatTest {

    private StudentFlat studentFlat;

    @BeforeEach
    public void setUp() {
        studentFlat = new StudentFlat(30,"15-07-2020",20);
    }

    @Test
    public void canGetNumberOfPartiesHosted() {
        assertThat(studentFlat.getNumberOfPartiesHosted()).isEqualTo(20);
    }

    @Test
    public void hasNoisyNeighbourhood() {
        assertThat(studentFlat.noisyNeighbourhood()).isEqualTo("SO NOISY!");
    }

    // ABSTRACT METHOD
    @Test
    public void canCalculateArea() {
        assertThat(studentFlat.calculateArea()).isEqualTo(0);
    }

    // INTERFACE METHOD
    @Test
    public void isRentable() {
        String actual = studentFlat.rent(800);
        assertThat(actual).isEqualTo("A room is up for up for rent for £800 per month.");
    }
}
