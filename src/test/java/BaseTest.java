import org.testng.annotations.BeforeTest;
import pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import java.util.Random;

public class BaseTest {
    WebDriver driver;
    IndexPage indexPage;
    AccountPage accountPage;

    @BeforeTest
    public void before() {
        driver = new ChromeDriver();
        indexPage = new IndexPage(driver);
        accountPage = new AccountPage(driver);
    }

    @AfterTest
    public void after() {
        driver.close();
    }
}
