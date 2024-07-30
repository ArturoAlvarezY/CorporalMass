import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*; 
import dev.arturo.models.CorporalMass;

public class CorporalMassTest {

    CorporalMass corporalMass = new CorporalMass(88.8, 1.85);

    @Test
    void testGetHeight() {
        assertThat(corporalMass.getHeight(), is(1.85));
    }

    @Test
    void testGetKilograms() {
        assertThat(corporalMass.getKilograms(), equalTo(88.8));
    }

    @Test
    void testImcCalc() {
        assertThat(corporalMass.imcCalc(), is(28.45));
    }

    @Test
    void testSetHeight() {
        corporalMass.setHeight(1.99);
        assertThat(corporalMass.getHeight(), is(1.99));
    }

    @Test
    void testSetKilograms() {
        corporalMass.setKilograms(85.0);
        assertThat(corporalMass.getKilograms(), is(85.0));
    }
}
