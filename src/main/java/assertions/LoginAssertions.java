package assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.BasePage;

public class LoginAssertions extends BasePage {

    @FindBy(css="[href*='logout.htm']")
    private WebElement logoutLink;


    public LoginAssertions(WebDriver driver){
        super(driver);
    }

    public void isUserLoggedIn(){
        Assert.assertTrue(logoutLink.isDisplayed());
    }
}



