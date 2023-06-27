import org.junit.jupiter.api.Test;
import pages.AccountEntries;

public class SignupTest extends PlaywrightRunner {

    @Test
    public void signupTest() {
        page.navigate("https://bestbuy.com/?intl=nosplash");

        accountNavigationPage.navigateTo(AccountEntries.CREATE_ACCOUNT);

        createAccountPage.createAccount();
    }
}
