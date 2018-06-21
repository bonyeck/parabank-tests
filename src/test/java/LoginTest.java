import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.IndexPage;

public class LoginTest extends BaseTest{

    @Test
    public void shouldLogin() {
        indexPage.openIndexPage()
                .setLogin("John")
                .setPassword("123123!$L")
                .clickLoginButton()
                .loginAssertion.isUserLoggedIn();

    }
}


