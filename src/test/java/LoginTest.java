import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.IndexPage;

public class LoginTest {

    WebDriver driver;
    IndexPage indexPage;
    AccountPage accountPage;

    @BeforeTest
    public void before() {
        driver = new ChromeDriver();
        indexPage = new IndexPage(driver);
        accountPage = new AccountPage(driver);
    }

    @Test
    public void shouldLogin() {
        indexPage.openIndexPage();
        indexPage.setLogin("John");
        indexPage.setPassword("123123!$L");
        indexPage.clickLoginButton();
        Assert.assertTrue(accountPage.isUserLoggedIn());
    }
}


