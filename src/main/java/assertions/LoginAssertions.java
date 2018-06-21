package assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.BasePage;

import java.util.List;

public class LoginAssertions extends BasePage {

    @FindBy(css="[href*='logout.htm']")
    private List<WebElement> logoutLink;


    public LoginAssertions(WebDriver driver){
        super(driver);
    }

    public void isUserLoggedIn(){
        Assert.assertTrue(logoutLink.size()!=0);
    }

    public void isUserLoggedOut() {
        Assert.assertTrue(logoutLink.size()==0);
    }
}



