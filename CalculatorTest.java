// CalculatorTest.java
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        assertEquals(15, Calculator.add(10, 5), 0.001);
        assertEquals(-5, Calculator.add(-10, 5), 0.001);
    }

    @Test
    public void testSubtraction() {
        assertEquals(5, Calculator.subtract(10, 5), 0.001);
        assertEquals(-15, Calculator.subtract(-10, 5), 0.001);
    }

    @Test
    public void testMultiplication() {
        assertEquals(50, Calculator.multiply(10, 5), 0.001);
        assertEquals(-50, Calculator.multiply(-10, 5), 0.001);
    }

    @Test
    public void testDivision() {
        assertEquals("2.0", Calculator.divide(10, 5));
        assertEquals("Cannot divide by zero", Calculator.divide(10, 0));
        assertEquals("-2.0", Calculator.divide(-10, 5));
    }
}