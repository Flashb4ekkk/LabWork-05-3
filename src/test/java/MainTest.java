import org.junit.Test;

import static org.example.Main.f;
import static org.example.Main.factorial;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void TestFactorial() { // n = 2
        assertEquals(120, factorial(2 * 2 + 1), 1e-7);
    }

    @Test
    public void TestF() { // t = 4
        assertEquals(1.0204, f(f(2 * 4)), 1e-4);
    }
}
