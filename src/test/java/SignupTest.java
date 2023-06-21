import com.microsoft.playwright.*;
import com.microsoft.playwright.assertions.LocatorAssertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

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
        page.locator("#reenterPassword").fill("First NameX");

        assertThat(page.locator("span.c-input-error-message")).containsText("Your passwords match!", new LocatorAssertions.ContainsTextOptions().setTimeout(30000));
        page.locator("#phone").fill("1234567890");
        page.locator("input#is-recovery-phone").check();

        assertThat(page.locator("button.cia-form__controls__submit")).isEnabled(new LocatorAssertions.IsEnabledOptions().setTimeout(10000));

        System.out.println();
        browserContext.close();
        browser.close();
    }
}
