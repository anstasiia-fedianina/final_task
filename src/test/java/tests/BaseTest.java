package tests;

import com.codeborne.selenide.junit.ScreenShooter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Rule;

public class BaseTest {
    @Rule
    public ScreenShooter makeScreenshotOnFailure = ScreenShooter.failedTests().succeededTests();

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }
    /*@After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }*/
}
