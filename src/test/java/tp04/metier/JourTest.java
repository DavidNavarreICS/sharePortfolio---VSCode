package tp04.metier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JourTest {
    private static final int DEFAULT_DAY = 1;
    private static final int DEFAULT_YEAR = 1;

    @Test
    void testBuildWithWrongParameters() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Jour(DEFAULT_YEAR, -1);
        });
    }
}
