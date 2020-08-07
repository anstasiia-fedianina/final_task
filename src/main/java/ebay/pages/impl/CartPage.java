package ebay.pages.impl;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import ebay.PagePath;
import ebay.pages.BasePage;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

@PagePath("https://cart.payments.ebay.com/")
@Getter
public class CartPage extends BasePage {
    private static final SelenideElement title = $x("//h1[contains(@class,'main-title')]");
    private SelenideElement itemInfo = $x("//div[contains(@class,'group details')]");
    private SelenideElement confirmationMessage = $x("//div[contains(@class,'confirm')]");
    private SelenideElement removeBtn = $x("//button[contains(@data-test-id,'remove')]");

    public CartPage() {
        super(title);
    }
}
