import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import dev.arturo.models.CorporalMass;
import dev.arturo.models.ImcCalculator;

public class ImcCalculatorTest {
    ImcCalculator imcCalculator = new ImcCalculator();
    CorporalMass corporalMass = new CorporalMass(88.0, 1.85);


    @Test
    void testImcCalc() {
        assertThat(imcCalculator.imcCalc(corporalMass), is(28.2));
    }
}
