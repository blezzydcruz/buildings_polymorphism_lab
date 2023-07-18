import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OfficeTest {

    private Office office;

    @BeforeEach
    public void setUp() {
        office = new Office(60,"09-09-2020","BNTA");
    }

    @Test
    public void canGetCompanyName() {
        assertThat(office.getCompanyName()).isEqualTo("BNTA");
    }

    @Test
    public void hasNoisyNeighbourhood() {
        assertThat(office.noisyNeighbourhood()).isEqualTo("Noisy but Office is soundproofed");
    }

    // ADDED ABSTRACT METHOD
    @Test
    public void canCalculateArea() {
        assertThat(office.calculateArea()).isEqualTo(0);
    }
}
