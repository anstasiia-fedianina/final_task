package ebay.pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Selenide.$;

@Getter
@Log4j2
public abstract class BasePage {

        private final SelenideElement loadableElement;

        protected BasePage(SelenideElement pageLoadableLocator) {
            loadableElement = $(pageLoadableLocator);
        }
}
