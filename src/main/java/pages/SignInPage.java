package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class SignInPage {
    private final Page signInPage;
    private static final String EMAIL = "input#fld-e";
    private static final String PASSWORD = "input#fld-p1";
    private static final String CREDENTIAL_PICKER = "div#credential_picker_container";
    private static final String FECHAR = "div";
    private static final String SIGN_IN_BUTTON = "//button[@data-track='Sign In']";

    public SignInPage(Page page) {
        this.signInPage = page;
    }

    public void signIn(String email, String password){
        //signInPage.pause();
        signInPage.locator(CREDENTIAL_PICKER).waitFor(new Locator.WaitForOptions().setTimeout(30000));
        signInPage.locator(EMAIL).fill(email);
        signInPage.locator(PASSWORD).fill(password);

        signInPage.locator(CREDENTIAL_PICKER).waitFor(new Locator.WaitForOptions().setTimeout(30000));
        signInPage.locator(FECHAR).first().click();
        signInPage.locator(SIGN_IN_BUTTON).click();
    }
}
