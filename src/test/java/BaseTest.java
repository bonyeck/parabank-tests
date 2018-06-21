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
    RegisterPage registerPage;


    Random rg = new Random();
    int randomInt = rg.nextInt(1000);

    String firstName = "Mark";
    String lastName = "Spencer";
    String street = "Main Street 10";
    String city = "Los Angeles";
    String state = "California";
    String zipCode = "90002";
    String ssnTemplate = "AABB";
    String usernameTemplate = "markspencer";
    String password = "asdfzxcv";
    String username = usernameTemplate + randomInt;
    String ssn = ssnTemplate + randomInt;

    @BeforeTest
    public void before() {
        driver = new ChromeDriver();
        indexPage = new IndexPage(driver);
        accountPage = new AccountPage(driver);
        registerPage = new RegisterPage(driver);

    }

    @AfterTest
    public void closeBrowser() {
        driver.close();
    }
}
