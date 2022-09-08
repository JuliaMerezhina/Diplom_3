package constructortest;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pageobject.MainPage;
import pageobject.ProfilePage;
import pageobject.RegistrationPage;
import preentry.PreEntryTest;

import java.util.Map;

import static com.codeborne.selenide.Selenide.page;
import static org.junit.Assert.assertTrue;

public class ConstructorMainPageTest extends PreEntryTest {

    @Test
    @DisplayName("Cross to construct from personal acc")
    public void crossToConstructorFromPersonalAcc() {

        Map<String, String> userData = userOperations.registration();
        String userEmail = userData.get("email");
        String userName = userData.get("name");
        String userPassword = userData.get("password");

        MainPage mainPage = page(MainPage.class);
        RegistrationPage registrationPage = page(RegistrationPage.class);
        ProfilePage profilePage = page(ProfilePage.class);
        mainPage.clickMainPageLogButton();
        registrationPage.regFullForm(userName, userEmail, userPassword);
        mainPage.clickMainPageAccountButton();
        profilePage.clickLogoButton();

        boolean createOrderButtonSuccess = mainPage.isCreateOrderButton();
        assertTrue("Переход в конструктор не произошел", createOrderButtonSuccess);
    }
}