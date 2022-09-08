package logintest;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pageobject.LoginPage;
import pageobject.RegistrationPage;
import preentry.PreEntryTest;

import java.util.Map;

import static com.codeborne.selenide.Selenide.page;
import static org.junit.Assert.assertEquals;

public class LoginProfileRegistrationPageTest extends PreEntryTest {

    @Test
    @DisplayName("Log in Profile on Registration Page")
    public void loginProfileRegistrationPageTest() throws InterruptedException {

        Map<String, String> userData = userOperations.registration();
        String userEmail = userData.get("email");
        String userPassword = userData.get("password");
        RegistrationPage registrationPage = page(RegistrationPage.class);
        LoginPage loginPage = page(LoginPage.class);
        openMainPage.clickMainPageAccountButton();
        loginPage.clickRegLink();
        registrationPage.clickRegistrationPageButton();
        loginPage.categoryForm(userEmail, userPassword);
        Thread.sleep(1000);
        String currentUrl = WebDriverRunner.url();
        assertEquals("https://stellarburgers.nomoreparties.site/", currentUrl);
    }
}