import java.sql.Time;
import java.util.*;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;


public class mockingTest {
    calc calculator = new calc();


@Before

    public void Setting()
    {
        //10,5
        calculator.Setnumber1(10);
        calculator.Setnumber2(5);

        assertEquals(10,calculator.getNumber1());
        assertEquals(5,calculator.getNumber2());

    }

    @Test
    public void getSum()
    {
       int ret= calculator.sum(calculator.getNumber1(),calculator.getNumber2());
        //10,5
        assertEquals(15,ret);
    }
    @Test

    public void getSub()
    {
        int ret= calculator.sub(calculator.getNumber1(),calculator.getNumber2());
        //10,5
        assertEquals(5,ret);
    }

    @Test
    public void getMul()
    {
        int ret= calculator.mul(calculator.getNumber1(),calculator.getNumber2());
        //10,5
        assertEquals(50,ret);
    }
    @Test
    public void getDiv()
    {
        int ret= calculator.div(calculator.getNumber1(),calculator.getNumber2());
        //10,5
        assertEquals(2,ret);
    }


}
