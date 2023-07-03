package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.assertions.LocatorAssertions;
import services.EnvironmentReaderService;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class HomePage {

    public final Page homePage;
    private static final String TOP_MENU_LINK = "ul.bottom-nav-left li a";
    public HomePage(Page page) {
        this.homePage = page;
    }

    public void navigate(){
        homePage.navigate(EnvironmentReaderService.getProperty("url"));
    }

    public void checkWeAreOnTheHomePage(){
        assertThat(homePage.locator(TOP_MENU_LINK, new Page.LocatorOptions().setHasText("Deal of the Day"))).isVisible(new LocatorAssertions.IsVisibleOptions().setTimeout(20000));
    }
}
