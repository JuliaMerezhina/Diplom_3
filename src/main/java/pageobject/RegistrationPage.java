package pageobject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class RegistrationPage {

    public static final String REGISTRATION_URI = "https://stellarburgers.nomoreparties.site/register";

    //"Регистрация"
    @FindBy(how = How.XPATH, using = StaticName.REGISTRATION)
    public SelenideElement registration;

    //Name
    @FindBy(how = How.XPATH, using = StaticName.NAMEBUTTON)
    public SelenideElement nameButton;

    //Email
    @FindBy(how = How.XPATH, using = StaticName.EMAILBUTTON)
    public SelenideElement emailButton;

    //Password
    @FindBy(how = How.XPATH, using = StaticName.PASSWORDBUTTON)
    public SelenideElement passwordButton;
    //Register
    @FindBy(how = How.XPATH, using = StaticName.REGISTRATIONBUTTON)
    public SelenideElement registrationButton;
    //"Войти в аккаунт"
    @FindBy(how = How.XPATH, using = StaticName.REGISTRATIONPAGEBUTTON)
    public SelenideElement registrationPageButton;
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

    public void clickRegistrationButton() {
        this.registrationButton.click();
    }

    public void regFullForm(String name, String email, String password) {
        inputName(name);
        inputEmail(email);
        inputPassword(password);
        clickRegistrationButton();
    }

    public boolean isIncorrectPasswordMessage() {
        return incorrectPasswordMessage.isDisplayed();

    }

    public void clickRegistrationPageButton() {
        this.registrationPageButton.click();
    }
}


