import org.junit.jupiter.api.Test;
import pages.AccountEntries;

public class SignupTest extends PlaywrightRunner {

    @Test
    public void signupTest1() {
        homePage.navigate();

        accountNavigationPage.navigateTo(AccountEntries.CREATE_ACCOUNT);

        createAccountPage.createAccount();
    }
    @Test
    public void signupTest2() {
        homePage.navigate();

        accountNavigationPage.navigateTo(AccountEntries.CREATE_ACCOUNT);

        createAccountPage.createAccount();
    }
}
