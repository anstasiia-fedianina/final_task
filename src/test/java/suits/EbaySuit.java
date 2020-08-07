package suits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.AddingToCartTest;
import tests.SearchPageTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({AddingToCartTest.class, SearchPageTest.class})
public class EbaySuit {

}
