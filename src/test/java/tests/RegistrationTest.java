package tests;

import ebay.helpers.impl.MainPageHelper;
import ebay.helpers.impl.RegistrationHelper;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

public class RegistrationTest extends BaseTest {
    @Test
    public void checkEmptyEmailAndPasswordError() {
        MainPageHelper mainPageHelper = new MainPageHelper();
        mainPageHelper.openPage();
        mainPageHelper.clickRegButton();
        RegistrationHelper registrationHelper = new RegistrationHelper();
        registrationHelper.clickEmailField()
                .clickAway();
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(registrationHelper.checkEmptyEmailError())
                .as("Empty Email field error is not displayed.")
                .isTrue();
        registrationHelper.clickPassField()
                .clickAway();
        softAssertions.assertThat(registrationHelper.checkEmptyPassError())
                .as("Empty Password field error is not displayed.")
                .isTrue();
        softAssertions.assertAll();
    }
}
