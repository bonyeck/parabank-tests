import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @BeforeTest
    public void beforeTest(){
        indexPage.openIndexPage();
        indexPage.openRegistrationPage();
        registerPage.setFirstName(firstName);
        registerPage.setLastName(lastName);
        registerPage.setStreet(street);
        registerPage.setCity(city);
        registerPage.setState(state);
        registerPage.setZipCode(zipCode);
        registerPage.setSsn(ssn);
        registerPage.setUsername(username);
        registerPage.setPassword(password);
        registerPage.setRepeatedPassword(password);
        registerPage.clickRegisterButton();
        accountPage.logout();
    }

    @Test
    public void shouldLogin() {
        //let's add some test
    }

}
