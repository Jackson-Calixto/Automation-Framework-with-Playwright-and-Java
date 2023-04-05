import com.microsoft.playwright.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class FirstTest {

    @Test
    public void firstTest() {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext browserContext = browser.newContext(new Browser.NewContextOptions().setPermissions(Arrays.asList("geolocation")));
        Page page = browserContext.newPage();

        page.navigate("https://bestbuy.com/?intl=nosplash");
        
                      //a link [@dataAtribute=''] Http Tag Selector
        page.locator("//a[@data-lid='hdr_dotd']").click();

        System.out.println();

    }
}
