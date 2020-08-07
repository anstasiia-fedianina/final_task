package ebay.pages.impl;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import ebay.PagePath;
import ebay.pages.BasePage;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

@PagePath("https://www.ebay.com/sch/")
@Getter
public class SearchResultsPage extends BasePage {
    private static final SelenideElement saveSearch = $x("//div[contains(@class,'follow-heart')]");
    private ElementsCollection itemTitles = $$x("//h3[contains(@class,'item__title')]");
    private ElementsCollection items = $$x("//div[contains(@class,'item__wrapper')]");

    public SearchResultsPage() {
        super(saveSearch);
    }
}
