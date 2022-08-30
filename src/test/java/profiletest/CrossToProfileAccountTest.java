package profiletest;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pageobject.LoginPage;
import pageobject.ProfilePage;
import preentry.PreEntryTest;

import java.util.Map;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.page;
import static org.junit.Assert.assertTrue;

public class CrossToProfileAccountTest extends PreEntryTest {

    @Test
    @DisplayName("Cross To Profile Acc")
    public void crossToProfileAccountTest() {

        Map<String, String> userData = userOperations.registration();
        String userEmail = userData.get("email");
        String userPassword = userData.get("password");
        LoginPage loginPage = page(LoginPage.class);
        ProfilePage profilePage = page(ProfilePage.class);

        openMainPage.clickMainPageLogButton();
        loginPage.categoryForm(userEmail, userPassword);
        openMainPage.createOrderButton.shouldBe(enabled);
        openMainPage.clickMainPageAccountButton();
        profilePage.logout.shouldBe(enabled);
        boolean isExitButtonVisible = profilePage.isLogoutButton();
        assertTrue("Переход на страницу профиля не произошел", isExitButtonVisible);
    }
}