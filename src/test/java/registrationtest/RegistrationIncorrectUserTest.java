package registrationtest;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pageobject.LoginPage;
import pageobject.MainPage;
import pageobject.RegistrationPage;
import preentry.PreEntryTest;
import user.User;

import static com.codeborne.selenide.Selenide.page;
import static org.junit.Assert.assertFalse;

public class RegistrationIncorrectUserTest extends PreEntryTest {

    @Test
    @DisplayName("New User incorrect registration")
    public void incorrectNewUserRegTest() {

        MainPage mainPage = page(MainPage.class);
        RegistrationPage registrationPage = page(RegistrationPage.class);
        LoginPage loginPage = page(LoginPage.class);
        User user = User.getIncorrect();
        mainPage.clickMainPageAccountButton();
        loginPage.clickRegLink();
        registrationPage.regFullForm(user.getName(), user.getEmail(), user.getPassword());
        boolean incorrectMessageVisible = registrationPage.isIncorrectPasswordMessage();
        assertFalse("Сообщение об ошибке ввода пароля отсутствует", incorrectMessageVisible);
    }

    @Override
    public void removeUser() {

    }
}
