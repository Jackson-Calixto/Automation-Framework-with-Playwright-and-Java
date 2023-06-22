import org.junit.jupiter.api.Test;

public class SignupTest extends PlaywrightRunner {

    @Test
    public void signupTest() {
        page.navigate("https://bestbuy.com/?intl=nosplash");

        page.locator("#account-menu-account-button").click();
        page.locator("div.header-guest-user a.create-account-btn").click();

        createAccountPage.createAccount();
    }
}
