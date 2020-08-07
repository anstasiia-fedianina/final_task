package tests;

import ebay.helpers.impl.CartPageHelper;
import ebay.helpers.impl.ItemPageHelper;
import ebay.helpers.impl.MainPageHelper;
import ebay.helpers.impl.SearchResultHelper;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AddingToCartTest extends BaseTest {

    @Test
    public void addToCartFromSearch() {
        MainPageHelper mainPageHelper = new MainPageHelper();
        mainPageHelper.openPage();
        mainPageHelper.fillSearchField("kingdom hearts");
        SearchResultHelper searchResultHelper = new SearchResultHelper();
        searchResultHelper.clickFirstResult();
        ItemPageHelper itemPageHelper = new ItemPageHelper();
        itemPageHelper.pressAddToCartBtn();
        CartPageHelper cartPageHelper = new CartPageHelper();
        assertThat(cartPageHelper.itemIsDisplayed()).as("Item was not added to the cart.")
                .isTrue();
    }

    @Test
    public void removeFromCart() {
        CartPageHelper cartPageHelper = new CartPageHelper();
        cartPageHelper.openPage();
        cartPageHelper.removeItemFromCart();
        assertThat(cartPageHelper.confirmationMessageIsDisplayed()).as("Item was not deleted from the cart.")
                .isTrue();
    }
}
