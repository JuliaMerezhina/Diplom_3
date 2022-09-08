package pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.time.Duration;


public class LoginPage extends ProfilePage {


    //"Зарегистрироваться"
    @FindBy(how = How.XPATH, using = StaticName.REGLINK)
    private SelenideElement regLink;
    //Кнопка "Войти"
    @FindBy(how = How.XPATH, using = StaticName.LOGININPUT)
    private SelenideElement loginInput;
    //Текстовое поле "Вход"
    @FindBy(how = How.XPATH, using = StaticName.ENTERTEXT)
    private SelenideElement enterText;
    //Email
    @FindBy(how = How.XPATH, using = StaticName.EMAILINPUT)
    private SelenideElement emailInput;
    //Password
    @FindBy(how = How.XPATH, using = StaticName.PASSWORDINPUT)
    private SelenideElement passwordInput;
    //"Личный кабинет"
    @FindBy(how = How.XPATH, using = StaticName.ACCOUNTBUTTON)
    private SelenideElement accountButton;
    //"Забыли пароль"
    @FindBy(how = How.XPATH, using = StaticName.FORGOTPASSWORD)
    private SelenideElement forgotPassword;


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

    @Step("Нажать на кнопку Зарегистрироваться")
    //"Зарегистрироваться"
    public void clickRegLink() {
        this.regLink.click();
    }

    @Step("Нажать на кнопку Вход")
    //"Вход"
    public String getEnterText() {
        return this.enterText.getText();
    }

    @Step("Нажать на кнопку Личный кабинет")
    //"Личный кабинет"
    public void clickProfileAccount() {
        this.accountButton.click();
    }

    @Step("Нажать на кнопку Забыли пароль")
    //"Забыли пароль"
    public void clickForgotPassword() {
        this.forgotPassword.click();
    }

    @Step("Нажать на кнопку Войти")
    //"Войти" - видимость кнопки
    public boolean visibleLogButton() {
        return loginInput.isDisplayed();
    }
}





