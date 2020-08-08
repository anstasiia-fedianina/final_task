package tests;

import ebay.helpers.impl.MainPageHelper;
import ebay.helpers.impl.SearchResultHelper;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchPageTest {
    public static final String SEARCH_REQUEST = "kingdom hearts";
    public static final String CATEGORY_REQUEST = "Philip Reeve";

    @Test
    public void searchFor() {
        MainPageHelper mainPageHelper = new MainPageHelper();
        mainPageHelper.openPage();
        mainPageHelper.fillSearchField(SEARCH_REQUEST);
        SearchResultHelper searchResultHelper = new SearchResultHelper();

        assertThat(searchResultHelper.titlesContainRequest(SEARCH_REQUEST))
                .as("Search doesn't work correctly")
                .isTrue();
    }

    @Test
    public void searchForBooksCategory() {
        MainPageHelper mainPageHelper = new MainPageHelper();
        mainPageHelper.openPage();
        mainPageHelper.choseBookCategory();
        mainPageHelper.fillSearchField(CATEGORY_REQUEST);
        SearchResultHelper searchResultHelper = new SearchResultHelper();

        assertThat(searchResultHelper.firstTitleContainRequest(CATEGORY_REQUEST))
                .as("Search doesn't work correctly")
                .isTrue();
    }
}
