import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    @Test
    public void testEmptyString() {
        assertEquals(0, StringCalculator.calcul(""));
    }

    @Test
    public void testSingleNumber() {
        assertEquals(20, StringCalculator.calcul("20"));
    }

    @Test
    public void testSingleNumberNegative() {
        assertEquals(-20, StringCalculator.calcul("-20"));
    }

    @Test
    public void testTwoNumbers() {
        assertEquals(8, StringCalculator.calcul("3,5"));
    }

    @Test
    public void testMultipleNumbers() {
        assertEquals(29, StringCalculator.calcul("10,6,6,7"));
    }

    @Test
    public void testMultipleNumbersN() {
        assertEquals(17, StringCalculator.calcul("10,-6,6,7"));
    }

    @Test
    public void testEndsWithComma() {
        assertEquals(29, StringCalculator.calcul("10,6,6,7,"));
    }

    @Test
    public void testNewlineSeparator() {
        assertEquals(5, StringCalculator.calcul("\n2,3"));
        assertEquals(10, StringCalculator.calcul("5,\n2,3"));
        assertEquals(10, StringCalculator.calcul("5\n2,3"));
    }

    @Test
    public void testNullInput() {
        assertEquals(0, StringCalculator.calcul(null));
    }
}