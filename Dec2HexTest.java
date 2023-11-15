import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Dec2HexTest {

    public Dec2HexTest()
   {}
    Dec2Hex Dec2Hex;

    @Before
    public void setUp() {
        Dec2Hex = new Dec2Hex();
    }

    @Test
    public void testCalculate() {
        assertEquals("Regular calculation should work",30, Dec2Hex.Arg1(48));
    }

    @Test
    public void testCalculateWithZero() {
        assertEquals("Calculation with zero should be zero", 0, Dec2Hex.Arg1(0));
        assertEquals("Calculation with zero should be zero", 0, Dec2Hex.Arg1(0));
    }
}
