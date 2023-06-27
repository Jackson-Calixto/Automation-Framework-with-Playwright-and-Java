package pages;

import com.microsoft.playwright.Page;

public class AccountNavigationPage {
    private final Page accountNavigationPage;
    private static final String ACCOUNT_BUTTON = "#account-menu-account-button";
    private static final String ACCOUNT_MENU_LINKS = ".account-menu a:has-text('%s')";

    public AccountNavigationPage(Page page) {
        this.accountNavigationPage = page;
    }

    public void navigateTo(AccountEntries location){
        accountNavigationPage.locator(ACCOUNT_BUTTON).click();

        accountNavigationPage.locator(String.format(ACCOUNT_MENU_LINKS, location.getDisplayName())).click();
    }
}
