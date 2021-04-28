import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class RibaldNeutrinoTest {

    @Test
    void isRibaldShouldReturnTrue() {

        RibaldNeutrino neutrino = new RibaldNeutrino();
        assertThat(neutrino.isRibald()).isTrue();
    }
}