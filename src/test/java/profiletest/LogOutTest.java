package profiletest;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pageobject.LoginPage;
import pageobject.ProfilePage;
import preentry.PreEntryTest;

import java.util.Map;

import static com.codeborne.selenide.Selenide.page;
import static org.junit.Assert.assertTrue;

public class LogOutTest extends PreEntryTest {

    @Test
    @DisplayName("Log out profile account")
    public void logOutProfileAccountTest() {

        Map<String, String> userData = userOperations.registration();
        String userEmail = userData.get("email");
        String userPassword = userData.get("password");
        LoginPage loginPage = page(LoginPage.class);
        ProfilePage profilePage = page(ProfilePage.class);
        openMainPage.clickMainPageLogButton();
        loginPage.categoryForm(userEmail, userPassword);
        openMainPage.clickMainPageAccountButton();
        profilePage.clickLogoutButton();
        boolean isLoginButtonVisible = loginPage.visibleLogButton();
        assertTrue("Переход на страницу логина после выхода из личного кабинета не произошел", isLoginButtonVisible);
    }
}