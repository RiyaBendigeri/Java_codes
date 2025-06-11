import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
@DisplayName("calculator operations")
public class CalculatorTest {
    //@Disabled
    //@DisplayName("addition operation")
    @AfterAll
    public static void first()
    {
        System.out.println("i m before every1");
    }
    
    @BeforeEach
    public Calculator setup()
    {
        System.out.println("i m setup");
        Calculator calculator = new Calculator();
        return calculator;

    }
    @AfterEach
    public void after()
    {
        
        System.out.println("i m after");
    }   
    @Test
    public void addTest()
    {
        
        //Calculator calculator = new Calculator();
        Calculator calculator = setup();
        int result = calculator.add(5,6);
        //in order to verify write assesrtions
        assertEquals(11, result);
    }
    @Test
    public void subtractTest(){
       // Calculator obj = new Calculator();
       Calculator calculator = setup();
        int result = calculator.sub(9,1);
        assertEquals(8,result);
    }
}
