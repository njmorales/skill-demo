import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    @Test
    public void testMultiply() {
        assertEquals(4, SkillDemo.multiply(2, 1)); //fails initially
    }
}
