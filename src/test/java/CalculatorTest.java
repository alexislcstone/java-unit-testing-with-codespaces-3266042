import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int expected = 3;

        int actual = calculator.add(1, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void testSubtract() {
        int expected = 5;

        int actual = calculator.subtract(6, 1);

        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {
        int expected = 10;

        int actual = calculator.multiply(5, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void testDivide() {
        double expected = 2;

        double actual = calculator.divide(4, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void testDivideNotIntegers() {
        double expected = 2.5;

        double actual = calculator.divide(5, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void testIsEven() {
        boolean actual = calculator.isEven(6);

        assertTrue(actual);
    }

    @Test
    public void testIsOdd() {
        boolean actual = calculator.isEven(7);

        assertFalse(actual);
    }

    @Test
    public void testIncrementArray() {
        int[] expected = new int[] { 2, 3, 4 };

        int[] actual = calculator.incrementArray(new int[] { 1, 2, 3 });

        assertArrayEquals(expected, actual);
    }

    // check that an exception error is thrown in the correct cases
    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));

        String expected = "Ints cannot be divided by zero";

        String actual = exception.getMessage();

        assertEquals(expected, actual);
    }

}