package pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.time.Duration;


public class LoginPage extends ProfilePage {


    //"Зарегистрироваться"
    @FindBy(how = How.XPATH, using = StaticName.REGLINK)
    public SelenideElement regLink;
    //Кнопка "Войти"
    @FindBy(how = How.XPATH, using = StaticName.LOGININPUT)
    public SelenideElement loginInput;
    //Текстовое поле "Вход"
    @FindBy(how = How.XPATH, using = StaticName.ENTERTEXT)
    public SelenideElement enterText;
    //Email
    @FindBy(how = How.XPATH, using = StaticName.EMAILINPUT)
    public SelenideElement emailInput;
    //Password
    @FindBy(how = How.XPATH, using = StaticName.PASSWORDINPUT)
    public SelenideElement passwordInput;
    //"Личный кабинет"
    @FindBy(how = How.XPATH, using = StaticName.ACCOUNTBUTTON)
    public SelenideElement accountButton;
    //"Забыли пароль"
    @FindBy(how = How.XPATH, using = StaticName.FORGOTPASSWORD)
    public SelenideElement forgotPassword;


    public void enterEmail(String email) {
        this.emailInput.click();
        this.emailInput.setValue(email);
    }

    public void enterPassword(String password) {
        this.passwordInput.click();
        this.passwordInput.setValue(password).shouldBe(Condition.appear,
                Duration.ofSeconds(10));
    }

    public void clickEnterButton() {
        this.loginInput.shouldBe(Condition.appear, Duration.ofSeconds(10)).click();
    }

    public void categoryForm(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickEnterButton();
    }

    //"Зарегистрироваться"
    public void clickRegLink() {
        this.regLink.click();
    }

    //"Вход"
    public String getEnterText() {
        return this.enterText.getText();
    }

    //"Личный кабинет"
    public void clickProfileAccount() {
        this.accountButton.click();
    }

    //"Забыли пароль"
    public void clickForgotPassword() {
        this.forgotPassword.click();
    }

    //"Войти" - видимость кнопки
    public boolean visibleLogButton() {
        return loginInput.isDisplayed();
    }
}





