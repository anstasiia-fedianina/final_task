package ebay.helpers.impl;

import ebay.helpers.BaseHelper;
import ebay.pages.impl.SearchResultsPage;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class SearchResultHelper extends BaseHelper<SearchResultsPage> {

    public SearchResultHelper() {
        super(new SearchResultsPage());
    }

    public boolean titlesContainRequest(String request) {
        return getPage().getItemTitles().stream()
                .allMatch(item -> item.getText().toLowerCase().contains(request.toLowerCase()));
    }

    public boolean firstTitleContainRequest(String request) {
        return getPage().getItemTitles().get(0).getText().toLowerCase().contains(request.toLowerCase());
    }

    public void clickFirstResult() {
        getPage().getItems().first().click();
    }

    public SearchResultHelper open() {
        super.openPage();
        log.info("Page {} was opened", this.getClass().getSimpleName());

        return this;
    }

}
