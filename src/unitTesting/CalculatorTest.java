package unitTesting;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {

    @Test // Positive test
    public void testdoSum(){
        int expectedresult=35;
        int actualresult= Calculator.doSum(15,20);
        Assert.assertEquals("expectedresult","actualresult");

    }
    @Test(timeout = 50)@Ignore // This ignor annotation will ignor to run
    public void testdoSub(){
        int expectedResult=10;  // when expected resulut is not equal to actual result
        int actualResult=Calculator.doSub(25,10);
       Assert.assertNotEquals("expectedResult","actualResult"); // assertNot Equal is use for negetive test
    }



}
