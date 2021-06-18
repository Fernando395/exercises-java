//Faça um programa que receba um valor que é o valor pago, um segundo valor que é o preço do produto e
//retorne o troco a ser dado.


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MarketTest {
    @Test
    public void shouldCalcTheChange() {
        Assertions.assertEquals(14.50, Market.calculateChange(50, 35.50));
        Assertions.assertEquals(15, Market.calculateChange(50.50, 35.50));
        Assertions.assertEquals(15, Market.calculateChange(50, 35));
        Assertions.assertEquals(10, Market.calculateChange(50, 40));
        Assertions.assertEquals(0, Market.calculateChange(50, 50));

    }
}
