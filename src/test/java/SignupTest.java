import org.junit.jupiter.api.Test;
import pages.AccountEntries;

public class SignupTest extends PlaywrightRunner {

    @Test
    public void signUpTest() {
        homePage.navigate();
        accountNavigationPage.navigateTo(AccountEntries.CREATE_ACCOUNT);
        createAccountPage.createAccount();
    }
}
