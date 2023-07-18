import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class EstateAgentTest {

    private EstateAgent estateAgent;

    @BeforeEach
    public void setUp() {
        estateAgent = new EstateAgent();
    }

    @Test
    public void canCountBuildings() {
        assertThat(estateAgent.countBuildings()).isEqualTo(0);
    }

    @Test
    public void canAddBuildings() {
        Building building = new Bungalow(3, "01-01-2018",true);
        estateAgent.addBuildings(building);
        assertThat(estateAgent.countBuildings()).isEqualTo(1);
    }

    @Test
    public void canAddMultipleBuildings() {
        Building bungalow = new Bungalow(3, "01-01-2018",true);
        Building studentFlat = new StudentFlat(30, "15-07-2020", 20);
        estateAgent.addBuildings(bungalow);
        estateAgent.addBuildings(studentFlat);
        assertThat(estateAgent.countBuildings()).isEqualTo(2);
    }
}
