import com.microsoft.playwright.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class FirstTest {

    @Test
    public void firstTest() {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext browserContext = browser
                .newContext(new Browser.NewContextOptions().setPermissions(Arrays.asList("geolocation")));
        Page page = browserContext.newPage();

        page.navigate("https://bestbuy.com/?intl=nosplash");

        // a link [@dataAtribute=''] Http Tag Selector
        // page.locator("//a[@data-lid='hdr_dotd']").click();
        // https://www.w3schools.com/cssref/css_selectors.php
        // page.locator("[data-lid=hdr_dotd]").click(); //CSS Selectors
        // https://playwright.dev/docs/other-locators
        //page.locator("a:has-text(\"Deal of the Day\")").click(); // Other Locators

        //Locator locator = page.locator("a:has-text(\"Deal of the Day\")"); // Locators
        //locator.click();

        Locator menuItems = page.locator("ul.bottom-nav-left li a"); // Locators

        System.out.println(menuItems.allTextContents());

        System.out.println();

    }
}
