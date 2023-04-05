import com.microsoft.playwright.*;
import org.junit.jupiter.api.Test;

public class FirstTest {

    @Test
    public void firstTest() {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext browserContext = browser.newContext();
        BrowserContext browserContext2 = browser.newContext();
        Page page = browserContext.newPage();
        Page page2 = browserContext2.newPage();

        page.navigate("https://google.com");
        page2.navigate("https://bing.com");

        System.out.println();

    }
}
