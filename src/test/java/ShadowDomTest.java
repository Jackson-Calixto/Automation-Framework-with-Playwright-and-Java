import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.Test;

public class ShadowDomTest {
    @Test
    public void shadowDomTest(){
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();

        page.navigate("http://watir.com/examples/shadow_dom.html");

        page.pause();

        //CSS Selector works under Shadow Dom
        //page.locator("input[type='text']").fill("Playwright");
        //page.locator("input[type='checkbox']").check();

        //XPath Selector doesn't work under Shadow Dom
        page.locator("//input[@type='text']").fill("Playwright");
    }
}
