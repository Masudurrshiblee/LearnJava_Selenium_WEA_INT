package unitTesting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses(  // This is the way we can run all test class at same time
        {
                CalculatorTest.class,
                CalculatorTest1.class,
                CalculatorTest2.class
        }
)
public class TestSuite {

}
