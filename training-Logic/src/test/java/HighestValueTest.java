
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HighestValueTest {

    @Test
    public void shouldReturnTheHighestValue() {
        assertEquals(10, HighestValue.calc(5, 10, 7, 2));
        assertEquals(5, HighestValue.calc(5, 2, 3, 4));
        assertEquals(7, HighestValue.calc(1, 7, 6, 5));
        assertEquals(30, HighestValue.calc(30, 11, 12, 25));
        assertEquals(8, HighestValue.calc(2, 0, 1, 8));
    }
}
