package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import scenarios.LoginScenario;

public abstract class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public boolean waitForJStoLoad() {

        WebDriverWait wait = new WebDriverWait(driver, 30);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // wait for jQuery to load
        ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                try {
                    return ((Long) ((JavascriptExecutor) driver).executeScript("return jQuery.active") == 0);
                } catch (Exception e) {
                    return true;
                }
            }
        };

        // wait for Javascript to load
        ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState")
                        .toString().equals("complete");
            }
        };

        return wait.until(jQueryLoad) && wait.until(jsLoad);
    }

    public <I extends BasePage, O extends BasePage> O run(scenarios.Scenario<I, O> scenario) {
        return scenario.run((I) this);
    }

}
