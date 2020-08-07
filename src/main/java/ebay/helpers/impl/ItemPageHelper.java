package ebay.helpers.impl;

import com.codeborne.selenide.Condition;
import ebay.helpers.BaseHelper;
import ebay.pages.impl.ItemPage;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ItemPageHelper extends BaseHelper<ItemPage> {
    public ItemPageHelper() {
        super(new ItemPage());
    }

    public CartPageHelper pressAddToCartBtn() {
        getPage().getCartButton().click();
        CartPageHelper cartPageHelper = new CartPageHelper();
        cartPageHelper.getPage().getLoadableElement().shouldBe(Condition.visible);
        return cartPageHelper;
    }
}
