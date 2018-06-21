package scenarios;

import pages.AccountPage;
import pages.IndexPage;

public class LoginScenario implements Scenario<IndexPage, AccountPage> {
    private String login;
    private String password;

    public LoginScenario(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public AccountPage run(IndexPage entry) {
        return entry.setLogin(login)
                .setPassword(password)
                .clickLoginButton();
    }
}
