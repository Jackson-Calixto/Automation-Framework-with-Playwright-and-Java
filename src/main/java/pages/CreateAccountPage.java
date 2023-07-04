package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.assertions.LocatorAssertions;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class CreateAccountPage {

    private final Page createAccountPage;

    private static final String FIRST_NAME = "#firstName";
    private static final String LAST_NAME = "#lastName";
    private static final String EMAIL = "#email";
    private static final String PASSWORD = "#fld-p1";
    private static final String CONFIRM_PASSWORD = "#reenterPassword";
    private static final String VALIDATION_MESSAGE = "span.c-input-error-message";
    private static final String PHONE = "#phone";
    private static final String RECOVERY_PHONE_CHECKBOX = "input#is-recovery-phone";
    private static final String SUBMIT = "button.cia-form__controls__submit";

    public CreateAccountPage(Page page) {
        this.createAccountPage = page;
    }

    public void createAccount(){
        createAccountPage.locator(FIRST_NAME).fill("First Name");
        createAccountPage.locator(LAST_NAME).fill("Last Name");
        createAccountPage.locator(EMAIL).fill("First@Name.com");
        createAccountPage.locator(PASSWORD).fill("First Name");
        createAccountPage.locator(CONFIRM_PASSWORD).fill("First Name");
        assertThat(createAccountPage.locator(VALIDATION_MESSAGE)).containsText("Your passwords match!", new LocatorAssertions.ContainsTextOptions().setTimeout(30000));
        createAccountPage.locator(PHONE).fill("1234567890");
        createAccountPage.locator(RECOVERY_PHONE_CHECKBOX).check(new Locator.CheckOptions().setTimeout(70000));
        assertThat(createAccountPage.locator(SUBMIT)).isEnabled(new LocatorAssertions.IsEnabledOptions().setTimeout(10000));
    }
}
