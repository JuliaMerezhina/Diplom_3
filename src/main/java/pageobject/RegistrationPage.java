package pageobject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class RegistrationPage {

    public static final String REGISTRATION_URI = "https://stellarburgers.nomoreparties.site/register";


    //Name
    @FindBy(how = How.XPATH, using = StaticName.NAMEBUTTON)
    private SelenideElement nameButton;

    //Email
    @FindBy(how = How.XPATH, using = StaticName.EMAILBUTTON)
    private SelenideElement emailButton;

    //Password
    @FindBy(how = How.XPATH, using = StaticName.PASSWORDBUTTON)
    private SelenideElement passwordButton;
    //Register
    @FindBy(how = How.XPATH, using = StaticName.REGISTRATIONBUTTON)
    private SelenideElement registrationButton;
    //"Войти в аккаунт"
    @FindBy(how = How.XPATH, using = StaticName.REGISTRATIONPAGEBUTTON)
    private SelenideElement registrationPageButton;
    //Password incorrect message
    @FindBy(how = How.XPATH, using = StaticName.INCORRECTPASSWORDMESSAGE)
    private SelenideElement incorrectPasswordMessage;

    public void inputName(String name) {
        this.nameButton.click();
        this.nameButton.setValue(name);
    }

    public void inputEmail(String email) {
        this.emailButton.click();
        this.emailButton.setValue(email);
    }

    public void inputPassword(String password) {
        this.passwordButton.click();
        this.passwordButton.setValue(password);
    }

    @Step("Нажать на кнопку Зарегистрироваться")
    public void clickRegistrationButton() {
        this.registrationButton.click();
    }

    @Step("Заполнить форму")
    public void regFullForm(String name, String email, String password) {
        inputName(name);
        inputEmail(email);
        inputPassword(password);
        clickRegistrationButton();
    }

    @Step("Отображение сообщения об ошибке")
    public boolean isIncorrectPasswordMessage() {
        return incorrectPasswordMessage.isDisplayed();

    }

    public void clickRegistrationPageButton() {
        this.registrationPageButton.click();
    }
}


