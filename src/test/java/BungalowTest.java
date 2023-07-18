import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BungalowTest {

    private Bungalow bungalow;

    @BeforeEach
    public void setUp() {
        bungalow = new Bungalow(3,"01-01-2018", true);
    }

    @Test
    public void hasCentralHeating() {
        assertThat(bungalow.hasCentralHeating()).isEqualTo(true);
    }

    @Test
    public void hasNoisyNeighbourhood() {
        assertThat(bungalow.noisyNeighbourhood()).isEqualTo("So quiet");
    }

    //ADDED OVERLOAD METHOD
    @Test
    public void hasNoisyNeighbourhood_withArgument() {
        assertThat(bungalow.noisyNeighbourhood("too quiet")).isEqualTo("I think the neighbourhood is too quiet.");
    }

    // ADDED ABSTRACT METHOD
    @Test
    public void canCalculateArea() {
        assertThat(bungalow.calculateArea()).isEqualTo(0);
    }

}
