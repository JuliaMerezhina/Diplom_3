package logintest;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pageobject.LoginPage;
import pageobject.ResetPasswordPage;
import preentry.PreEntryTest;

import java.util.Map;

import static com.codeborne.selenide.Selenide.page;
import static org.junit.Assert.assertEquals;

public class LoginProfileToResetPasswordTest extends PreEntryTest {

    @Test
    @DisplayName("Log in Profile on ResetPassword Page")
    public void loginProfileResetPasswordPageTest() throws InterruptedException {

        Map<String, String> userData = userOperations.registration();
        String userEmail = userData.get("email");
        String userPassword = userData.get("password");
        LoginPage loginPage = page(LoginPage.class);
        ResetPasswordPage resetPasswordPage = page(ResetPasswordPage.class);
        openMainPage.clickMainPageAccountButton();
        loginPage.clickForgotPassword();
        resetPasswordPage.clickResetPass();
        loginPage.categoryForm(userEmail, userPassword);
        Thread.sleep(1000);
        String currentUrl = WebDriverRunner.url();
        assertEquals("https://stellarburgers.nomoreparties.site/", currentUrl);
    }
}

