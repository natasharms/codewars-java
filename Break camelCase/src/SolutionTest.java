import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void tests() {
        assertEquals( "camel Casing", Solution.camelCase("camelCasing"));
        assertEquals( "camel Casing Test", Solution.camelCase("camelCasingTest"));
        assertEquals( "camelcasingtest", Solution.camelCase("camelcasingtest"));
        assertEquals( "taylor Swift", Solution.camelCase("taylorSwift"));
        assertEquals( "coneyisland", Solution.camelCase("coneyisland"));
        assertEquals( "tolerate It", Solution.camelCase("tolerateIt"));
    }
}