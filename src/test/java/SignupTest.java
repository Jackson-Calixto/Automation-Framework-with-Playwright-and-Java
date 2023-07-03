import org.junit.jupiter.api.Test;
import pages.AccountEntries;

public class SignupTest extends PlaywrightRunner {

    @Test
    public void signupTest() {
        page.navigate(getProperty("url"));

        accountNavigationPage.navigateTo(AccountEntries.CREATE_ACCOUNT);

        createAccountPage.createAccount();
    }
}
