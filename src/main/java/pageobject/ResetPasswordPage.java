package pageobject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ResetPasswordPage {

    @FindBy(how = How.XPATH, using = StaticName.RESETPASSBUTTON)
    private SelenideElement resetPassButton;

    @Step("Нажать на кнопку Восстановить пароль")
    public void clickResetPass() {
        this.resetPassButton.click();
    }
}