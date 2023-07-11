import com.microsoft.playwright.*;
import org.junit.jupiter.api.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class IFrameTest {
    @Test
    public void iframeTest(){
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();

        page.navigate("https://rediff.com");

        page.pause();

        //FrameLocator iframe = page.frameLocator("iframe#moneyiframe");
        //iframe.locator("#query").fill("Capital First Ltd.");
        //iframe.locator("input[type='submit']").click();

        //page.frameLocator("iframe#moneyiframe").locator("#query").fill("Capital First Ltd.");
        page.frameByUrl("https://money.rediff.com/widget/moneywizwidget/rhome?src=rhome1").locator("#query").fill("Capital First Ltd.");

        Page popUp = page.waitForPopup(() -> {
            page.frameLocator("iframe#moneyiframe").locator("input[type='submit']").click();
        });

        assertThat(popUp.locator("#for_BSE")).containsText("Capital First Ltd.");

        System.out.println();
    }
}
