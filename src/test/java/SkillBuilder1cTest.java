import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.regex.Pattern;

/**
 * The test class SkillBuilder3Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SkillBuilder1cTest extends OutputTest
{
    /**
     * Default constructor for test class SkillBuilder2Test
     */
    public SkillBuilder1cTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        super.setUp();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
        super.tearDown();
    }

    @Test
    public void testMain_1()
    {
        setTestInput("1\n2\n2\n7");
        SkillBuilder1c.main(new String[]{});
        String expected = "Provide box length \\(meters\\):\n";
        expected += "Provide box width \\(meters\\):\n";
        expected += "Provide box height \\(meters\\):\n";
        expected += "Provide length of sides of chocolate cube \\(centimeters\\):\n\n";
        expected += "The box will fit a maximum of 10976 chocolate cubes.\n";
        expected += "And will have 235232.0 cm\\\\\\^3 of unused space!";
        String actual = getTestOutput();
        String message = "Test Failed!\nExpecting:\n"+expected+"\nActual:\n"+actual;
        assertTrue(Pattern.compile(expected.replaceAll("\\s",""))
                        .matcher(actual.replaceAll("\\s","")).find(),
                message);
    }

    @Test
    public void testMain_2()
    {
        setTestInput("8\n4\n3\n3\n4");
        SkillBuilder1c.main(new String[]{});
        String expected = "Provide box length \\(meters\\):\n";
        expected += "Provide box width \\(meters\\):\n";
        expected += "Provide box height \\(meters\\):\n";
        expected += "Provide length of sides of chocolate cube \\(centimeters\\):\n\n";
        expected += "The box will fit a maximum of 3537800 chocolate cubes.\n";
        expected += "And will have 479400.0 cm\\\\\\^3 of unused space!";
        String actual = getTestOutput();
        String message = "Test Failed!\nExpecting:\n"+expected+"\nActual:\n"+actual;
        assertTrue(Pattern.compile(expected.replaceAll("\\s",""))
                        .matcher(actual.replaceAll("\\s","")).find(),
                message);
    }
}
