package logintest;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pageobject.LoginPage;
import pageobject.RegistrationPage;
import preentry.PreEntryTest;

import java.util.Map;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.page;
import static org.junit.Assert.assertTrue;

public class LoginProfileRegistrationPageTest extends PreEntryTest {

    @Test
    @DisplayName("Log in Profile on Registration Page")
    public void loginProfileRegistrationPageTest() {

        Map<String, String> userData = userOperations.registration();
        String userEmail = userData.get("email");
        String userPassword = userData.get("password");
        RegistrationPage registrationPage = page(RegistrationPage.class);
        LoginPage loginPage = page(LoginPage.class);

        openMainPage.clickMainPageAccountButton();
        loginPage.clickRegLink();
        registrationPage.clickRegistrationPageButton();
        loginPage.categoryForm(userEmail, userPassword);

        openMainPage.createOrderButton.shouldBe(enabled);
        boolean createOrderButtonIsVisible = openMainPage.isCreateOrderButton();
        assertTrue("Переход на главную страницу не произошел", createOrderButtonIsVisible);
    }
}