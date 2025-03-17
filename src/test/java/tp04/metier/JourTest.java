package tp04.metier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JourTest {
    private static final int DEFAULT_DAY = 1;
    private static final int DEFAULT_YEAR = 1;

    @Test
    void testGetAttributes() {
        final Jour j1 = new Jour(DEFAULT_YEAR, DEFAULT_DAY);

        final int resultDay = j1.getNoJour();
        final int resultYear = j1.getAnnee();

        Assertions.assertEquals(DEFAULT_DAY, resultDay);
        Assertions.assertEquals(DEFAULT_YEAR, resultYear);
    }

    @Test
    void testBuildWithWrongParameters() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Jour(DEFAULT_YEAR, -1);
        });
    }
}
