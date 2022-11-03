package testing;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ sqrtTest.class, WordConatinsTTest.class, AllAssertions.class })
public class AllTests {

}
