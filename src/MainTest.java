import org.junit.Test;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void addition() {
        assertEquals(12.0,Main.Addition(7.0, 5.0));
        assertEquals(-1.0, Main.Addition(-10.0, 9.0));
        assertEquals(0.0, Main.Addition(-10.0, 10.0));
    }

    @Test
    public void subtraction() {
        assertEquals(-2.0,Main.Soustraction(8.0, 10));
        assertEquals(2.0,Main.Soustraction(10.0, 8.0));
        assertEquals(0.0,Main.Soustraction(10.0, 10.0));
    }

    @Test
    public void multiplication() {
        assertEquals(50.0,Main.Multiplication(10.0 , 5.0));
        assertEquals(-10.0,Main.Multiplication(-2.0 , 5.0));
        assertEquals(0.0,Main.Multiplication(2.0 , 0.0));
    }

    @Test
    public void division() {
        assertEquals(3.5,Main.Division(7.0, 2.0));
        assertEquals(-0.4,Main.Division(-2.0, 5.0));
        assertEquals(0.0,Main.Division(0.0, 5.0));
        try {
            Main.Division(9.0, 0);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Le diviseur ne peut être zéro", e.getMessage());
        }
    }
}