package registrationtest;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pageobject.LoginPage;
import pageobject.RegistrationPage;
import preentry.PreEntryTest;
import user.User;
import user.UserAuthorization;
import user.UserOperations;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.page;
import static org.junit.Assert.assertTrue;

public class RegistrationCorrectUserTest extends PreEntryTest {

    @Test
    @DisplayName("New User correct registration")
    public void correctNewUserRegTest() {

        RegistrationPage registrationPage = page(RegistrationPage.class);
        LoginPage loginPage = page(LoginPage.class);
        User user = User.getCorrect();

        openMainPage.clickMainPageAccountButton();
        loginPage.clickRegLink();
        registrationPage.regFullForm(user.getName(), user.getEmail(), user.getPassword());
        loginPage.loginInput.shouldBe(enabled);

        boolean isLoginButtonVisible = loginPage.visibleLogButton();
        assertTrue("Переход на страницу логина после регистрации не произошел", isLoginButtonVisible);

        //get token
        UserAuthorization userAuthorization = new UserAuthorization(user.getEmail(), user.getPassword());
        UserOperations userOperations = new UserOperations();

        userOperations.login(userAuthorization);
    }

}