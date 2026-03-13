import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator c = new Calculator();

    @Test
    public void testAdd() { assertEquals(5, c.add(2, 3)); }

    @Test
    public void testSubtract() { assertEquals(1, c.subtract(3, 2)); }

    @Test
    public void testMultiply() { assertEquals(6, c.multiply(2, 3)); }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            c.divideByZero(10, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}