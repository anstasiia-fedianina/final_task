package tests;

import ebay.helpers.impl.CartPageHelper;
import ebay.helpers.impl.ItemPageHelper;
import ebay.helpers.impl.MainPageHelper;
import ebay.helpers.impl.SearchResultHelper;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AddingToCartTest {
    public static final String SEARCH_REQUEST = "kingdom hearts";

    @Test
    public void addToCartFromSearch() {
        MainPageHelper mainPageHelper = new MainPageHelper();
        mainPageHelper.openPage();
        mainPageHelper.fillSearchField(SEARCH_REQUEST);
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
