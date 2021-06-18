import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PricePerKiloTest {
    @Test
    public void shouldCalcThePricePerKilo() {
        assertEquals(10, PricePerKilo.amountToBePaid(10, 1));
        assertEquals(25, PricePerKilo.amountToBePaid(10, 2.5));
        assertEquals(0, PricePerKilo.amountToBePaid(0, 1));
        assertEquals(55, PricePerKilo.amountToBePaid(10, 5.5));
        assertEquals(23, PricePerKilo.amountToBePaid(10, 2.3));
    }

}
