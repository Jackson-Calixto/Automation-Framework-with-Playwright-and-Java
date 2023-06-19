import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class SignupTest {

    @Test
    public void signupTest() {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext browserContext = browser
                .newContext(new Browser.NewContextOptions().setPermissions(Arrays.asList("geolocation")));
        Page page = browserContext.newPage();
        page.navigate("https://bestbuy.com/?intl=nosplash");

        page.locator("#account-menu-account-button").click();
        page.locator("div.header-guest-user a.create-account-btn").click();

        page.locator("#firstName").fill("First Name");
        page.locator("#lastName").fill("Last Name");
        page.locator("#email").fill("First@Name.com");
        page.locator("#fld-p1").fill("First Name");
        page.locator("#reenterPassword").fill("First Name");
        page.locator("#phone").fill("1234567890");
        page.locator("input#is-recovery-phone").check();
        

        System.out.println();

    }
}
