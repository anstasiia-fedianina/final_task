package ebay.helpers;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import ebay.PagePath;
import ebay.pages.BasePage;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Condition.visible;

@Log4j2
@Getter
public abstract class BaseHelper<PAGE extends BasePage> {
    private PAGE page;

    public BaseHelper(PAGE page) {
        this.page = page;
    }

    public void waitPageLoading(long time, TimeUnit timeUnit) {
        page.getLoadableElement().waitUntil(visible, timeUnit.toMillis(time));
        log.info("Wait loading {} page", page.getClass().getSimpleName());
    }

    protected void waitPageReady(long time, TimeUnit timeUnit) {
        WebDriverWait webDriverWait = new WebDriverWait(WebDriverRunner.getWebDriver(), timeUnit.toSeconds(time));
        webDriverWait.until(webDriver -> "complete".equals(Selenide.executeJavaScript("return document.readyState")));
        log.info("Page {} is ready to interact with", page.getClass().getSimpleName());
    }

    public void openPage() {
        String path = page.getClass().getAnnotation(PagePath.class).value();
        Selenide.open(path);
    }

    protected void refreshPage(){
        Selenide.refresh();
    }
}
