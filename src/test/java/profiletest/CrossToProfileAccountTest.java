package profiletest;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pageobject.LoginPage;
import preentry.PreEntryTest;

import java.util.Map;

import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.webdriver;
import static org.junit.Assert.assertEquals;

public class CrossToProfileAccountTest extends PreEntryTest {

    @Test
    @DisplayName("Cross to profile account")
    public void crossToProfileAccountTest() {

        Map<String, String> userData = userOperations.registration();
        String userEmail = userData.get("email");
        String userPassword = userData.get("password");
        LoginPage loginPage = page(LoginPage.class);
        openMainPage.clickMainPageLogButton();
        loginPage.categoryForm(userEmail, userPassword);
        openMainPage.clickMainPageAccountButton();
        String currentFrameUrl = webdriver().driver().getCurrentFrameUrl();
        assertEquals("https://stellarburgers.nomoreparties.site/account", currentFrameUrl);
    }
}