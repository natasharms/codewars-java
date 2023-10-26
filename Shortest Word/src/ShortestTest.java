import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ShortestTest{
    @Test
    public void findShort() throws Exception {
        assertEquals(3, Shortest.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, Shortest.findShort("turns out random test cases are easier than writing out basic ones"));
        assertEquals(2, Shortest.findShort("Let's travel abroad shall we"));
    }

}