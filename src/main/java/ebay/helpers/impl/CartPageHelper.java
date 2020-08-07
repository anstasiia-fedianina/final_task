package ebay.helpers.impl;

import com.codeborne.selenide.Condition;
import ebay.helpers.BaseHelper;
import ebay.pages.BasePage;
import ebay.pages.impl.CartPage;

public class CartPageHelper extends BaseHelper<CartPage> {
    public CartPageHelper() {
        super(new CartPage());
    }

    public boolean itemIsDisplayed(){
        return getPage().getItemInfo().isDisplayed();
    }

    public CartPageHelper removeItemFromCart() {
        getPage().getRemoveBtn().click();
        getPage().getConfirmationMessage().shouldBe(Condition.visible);
        return this;
    }

    public boolean confirmationMessageIsDisplayed() {
        return getPage().getConfirmationMessage().isDisplayed();
    }
}
