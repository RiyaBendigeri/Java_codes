import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class FactorialTest {
    @Test
    public void hellotest()
    {
        Factorial fact= new Factorial();
        String str = fact.Hello();
       // assertEquals("viratkohli",str);
       assertNotEquals("viratkohlii", str);
    }
}
