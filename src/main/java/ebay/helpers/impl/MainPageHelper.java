package ebay.helpers.impl;

import com.codeborne.selenide.Condition;
import ebay.helpers.BaseHelper;
import ebay.pages.impl.MainPage;

public class MainPageHelper extends BaseHelper<MainPage> {
    public MainPageHelper() {
        super(new MainPage());
    }

    public void fillSearchField(String request) {
        getPage().getSearchField().click();
        getPage().getSearchField().sendKeys(request);
        getPage().getSearchField().submit();
    }

    public void clickRegButton() {
        getPage().getRegButton().click();
    }

    public void choseBookCategory() {
        getPage().getCategorySelect().click();
        getPage().getBooksOption().shouldBe(Condition.visible).click();
    }
}
