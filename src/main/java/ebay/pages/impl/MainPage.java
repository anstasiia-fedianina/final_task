package ebay.pages.impl;

import com.codeborne.selenide.SelenideElement;
import ebay.PagePath;
import ebay.pages.BasePage;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@PagePath("https://www.ebay.com/")
@Getter
public class MainPage extends BasePage {
    private static final SelenideElement logo = $x("//img[contains(@id,'gh-logo')]");
    private SelenideElement searchField = $x("//input[@type='text']");
    private SelenideElement regButton = $x("//a[contains(text(),'reg')]");
    private SelenideElement categorySelect = $x("//select[@id='gh-cat']");
    private SelenideElement booksOption = $x("//option[contains(text(),'Books')]");

    public MainPage() {
        super(logo);
    }
}
