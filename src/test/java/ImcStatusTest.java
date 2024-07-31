import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;


import dev.arturo.models.ImcStatus;

public class ImcStatusTest {
    ImcStatus imcStatus = new ImcStatus();


    @Test
    void testGetCorporalStatus() {
    assertThat(imcStatus.getCorporalStatus(15), is("delgadez severa"));
    assertThat(imcStatus.getCorporalStatus(16), is("delgadez moderada"));
    assertThat(imcStatus.getCorporalStatus(17), is("delgadez leve"));
    assertThat(imcStatus.getCorporalStatus(18.5), is("peso normal"));
    assertThat(imcStatus.getCorporalStatus(25), is("sobrepeso"));
    assertThat(imcStatus.getCorporalStatus(30), is("obesidad leve"));
    assertThat(imcStatus.getCorporalStatus(35), is("obesidad moderada"));
    assertThat(imcStatus.getCorporalStatus(40), is("obesidad severa"));
    }
   
}
