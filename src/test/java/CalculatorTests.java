import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {

    Calculator calculatorTests = new Calculator();

    @Test
    public void testAdd() {
        int expected = calculatorTests.add(1, 2);
        assertEquals(3, expected);
    }

    @Test
    public void testSubtract() {
        int expected = 4;
        assertEquals(calculatorTests.subtract(9, 5), expected);
    }
}
