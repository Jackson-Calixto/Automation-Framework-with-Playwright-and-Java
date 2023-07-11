import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.Test;

public class JSEvaluateTest {
    @Test
    public void jsEvaluateTest() {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true));
        Page page = browser.newPage();

        page.navigate("https://playwright.dev/docs/evaluating");
        boolean linkFound = (boolean)page.evaluate("link => Array.from(document.querySelectorAll('.menu__link')).filter(el => el.innerText === link).length === 1", "Evaluating JavaScript");

        if (linkFound)
            System.out.println("Link found!");
        else
            System.out.println("Link not found!");
    }
}
