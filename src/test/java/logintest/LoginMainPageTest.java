package logintest;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pageobject.LoginPage;
import preentry.PreEntryTest;

import java.util.Map;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.page;
import static org.junit.Assert.assertTrue;

public class LoginMainPageTest extends PreEntryTest {

    @Test
    @DisplayName("Log in profile Acc from Main Page")
    public void logInProfileAccFromMainPageTest() {

        Map<String, String> userData = userOperations.registration();
        String userEmail = userData.get("email");
        String userPassword = userData.get("password");

        LoginPage loginPage = page(LoginPage.class);

        openMainPage.clickMainPageLogButton();
        loginPage.categoryForm(userEmail, userPassword);
        openMainPage.createOrderButton.shouldBe(enabled);
        boolean createOrderButtonIsVisible = openMainPage.isCreateOrderButton();
        assertTrue("Переход на главную страницу не произошел", createOrderButtonIsVisible);
    }
}

