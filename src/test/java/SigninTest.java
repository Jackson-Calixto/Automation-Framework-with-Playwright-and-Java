import org.junit.jupiter.api.Test;
import pages.AccountEntries;

public class SigninTest extends PlaywrightRunner {
    @Test
    public void signInExistingUser(){
        homePage.navigate();
        accountNavigationPage.navigateTo(AccountEntries.SIGN_IN);
        signInPage.signIn(getProperty("email"), getProperty("password"));
        homePage.checkWeAreOnTheHomePage();
    }
}
