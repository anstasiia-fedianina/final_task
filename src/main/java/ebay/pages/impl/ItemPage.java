package ebay.pages.impl;

import com.codeborne.selenide.SelenideElement;
import ebay.pages.BasePage;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;
@Getter
public class ItemPage extends BasePage {
    private static final SelenideElement itemTitle = $x("//h1[@id='itemTitle']");
    private SelenideElement cartButton = $x("//a[contains(@id,'CartBtn')]");

    public ItemPage() {
        super(itemTitle);
    }
}
