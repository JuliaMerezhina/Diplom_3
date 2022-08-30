package logintest;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pageobject.LoginPage;
import pageobject.ResetPasswordPage;
import preentry.PreEntryTest;

import java.util.Map;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.page;
import static org.junit.Assert.assertTrue;

public class LoginProfileToResetPasswordTest extends PreEntryTest {

    @Test
    @DisplayName("Log in Profile on ResetPassword Page")
    public void loginProfileResetPasswordPageTest() {

        Map<String, String> userData = userOperations.registration();
        String userEmail = userData.get("email");
        String userPassword = userData.get("password");
        LoginPage loginPage = page(LoginPage.class);
        ResetPasswordPage resetPasswordPage = page(ResetPasswordPage.class);

        openMainPage.clickMainPageAccountButton();
        loginPage.clickForgotPassword();
        resetPasswordPage.clickResetPass();
        loginPage.categoryForm(userEmail, userPassword);
        openMainPage.createOrderButton.shouldBe(enabled);
        boolean createOrderButtonIsVisible = openMainPage.isCreateOrderButton();
        assertTrue("Переход на главную страницу не произошел", createOrderButtonIsVisible);
    }
}

