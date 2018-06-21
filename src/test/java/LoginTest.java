import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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


