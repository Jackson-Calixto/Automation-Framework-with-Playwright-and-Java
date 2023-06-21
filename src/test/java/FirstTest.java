import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.jupiter.api.Test;

public class FirstTest extends PlaywrightRunner {

    @Test
    public void firstTest() {
        page.navigate("https://bestbuy.com/?intl=nosplash");

        // a link [@dataAtribute=''] Http Tag Selector
        // page.locator("//a[@data-lid='hdr_dotd']").click();
        // https://www.w3schools.com/cssref/css_selectors.php
        // page.locator("[data-lid=hdr_dotd]").click(); //CSS Selectors
        // https://playwright.dev/docs/other-locators
        // page.locator("a:has-text(\"Deal of the Day\")").click(); // Other Locators

        // Locator locator = page.locator("a:has-text(\"Deal of the Day\")"); //
        // Locators
        // locator.click();

        Locator menuItems = page.locator("ul.bottom-nav-left li a"); // Locators

        // System.out.println(menuItems.allTextContents());
        for (int i = 0; i < menuItems.count(); i++)
            System.out.println(menuItems.nth(i).textContent());

        page.locator("ul.bottom-nav-left li a", new Page.LocatorOptions().setHasText("Deal of the Day")).click(); // Filter Locator

        System.out.println();
    }
}
