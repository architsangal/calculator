import org.example.Calculator;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class CalculatorTest
{
    private static double DELTA;
    Calculator calculator;

    @Before
    public void initializationOfVariables()
    {
        calculator = new Calculator();
        DELTA = 1e-15;
    }

    @Test
    public void squareRootTruePositive()
    {
        assertEquals("Square Root Test 1", 2, calculator.squareRoot(4),DELTA);
        assertEquals("Square Root Test 2", 1.414, calculator.squareRoot(2),0.5);
    }

    @Test
    public void squareRootFalsePositive()
    {
        assertNotEquals("Square Root Test 3", 0, calculator.squareRoot(4),DELTA);
        assertNotEquals("Square Root Test 4", 0, calculator.squareRoot(2),0.5);
    }

    @Test
    public void factTruePositive()
    {
        assertEquals("Factorial Test 1", 24, calculator.factorial(4),0.1);
        assertEquals("Factorial Test 2", 2, calculator.factorial(2),0.1);
    }

    @Test
    public void factFalsePositive()
    {
        assertNotEquals("Factorial Test 3", -1, calculator.factorial(5),DELTA);
        assertNotEquals("Factorial Test 4", -1, calculator.factorial(2),0.5);
    }

    @Test
    public void natLogTruePositive()
    {
        assertEquals("Natural Logarithm Test 1", "0.9969486348916095", calculator.natLog(2.71));
        assertEquals("Natural Logarithm Test 2", "0.6931471805599453", calculator.natLog(2));
    }

    @Test
    public void natLogFalsePositive()
    {
        assertNotEquals("Natural Logarithm Test 3", "-1", calculator.natLog(5));
        assertNotEquals("Natural Logarithm Test 4", "-1", calculator.natLog(2));
    }

    @Test
    public void custPowerTruePositive()
    {
        assertEquals("Power Test 1", "8.0", calculator.custPower(2.0,3.0));
        assertEquals("Power Test 2", "16.0", calculator.custPower(4.0,2.0));
    }

    @Test
    public void custPowerFalsePositive()
    {
        assertNotEquals("Power Test 3", "-1", calculator.custPower(5,1));
        assertNotEquals("Power Test 4", "-1", calculator.custPower(2,1));
    }

}
