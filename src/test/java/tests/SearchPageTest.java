package tests;

import ebay.helpers.impl.MainPageHelper;
import ebay.helpers.impl.SearchResultHelper;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchPageTest extends BaseTest {

    @Test
    public void searchFor() {
        MainPageHelper mainPageHelper = new MainPageHelper();
        mainPageHelper.openPage();
        mainPageHelper.fillSearchField("kingdom hearts");
        SearchResultHelper searchResultHelper = new SearchResultHelper();

        assertThat(searchResultHelper.titlesContainRequest("kingdom hearts"))
                .as("Search doesn't work correctly")
                .isTrue();
    }
}
