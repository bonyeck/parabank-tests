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

    @BeforeTest
    public void before() {
        driver = new ChromeDriver();
    }

    @Test
    public void shouldLogin() {
       //let's add some test
    }
}


