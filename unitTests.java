// Import needed Libraries
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import converters.Dec2Hex;

public class unitTests {

    @Test
    public void testInt() {
        assertEquals("Using an int should work","Hexadecimal representation is: C", Dec2Hex.convDec(new String[]{"12"}));
    }

    @Test
    public void testEmpty() {
        assertEquals("Using no args should return an error but not fail","Missing Argument", Dec2Hex.convDec(new String[]{}));
    }

    @Test
    public void testInvalid() {
        assertEquals("Sending anything Non-numeric should also fail but gracefully","Invalid Argument", Dec2Hex.convDec(new String[]{"A"}));
    }

}