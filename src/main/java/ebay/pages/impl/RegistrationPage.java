package ebay.pages.impl;

import com.codeborne.selenide.SelenideElement;
import ebay.PagePath;
import ebay.pages.BasePage;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@PagePath("https://reg.ebay.com/reg/PartialReg")
@Getter
public class RegistrationPage extends BasePage {
    private static final SelenideElement createAccountText = $x("//div[contains(@class,'giant-text')]");

    private SelenideElement emailField = $x("//input[@name='email']");
    private SelenideElement emailError = $x("//div[@id='email_w']");
    private SelenideElement passwordField = $x("//input[@name='PASSWORD']");
    private SelenideElement passwordError = $x("//div[@id='PASSWORD_w']");
    public RegistrationPage() {
        super(createAccountText);
    }
}
