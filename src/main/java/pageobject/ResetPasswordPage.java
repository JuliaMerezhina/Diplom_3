package pageobject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ResetPasswordPage {

    @FindBy(how = How.XPATH, using = StaticName.RESETPASSBUTTON)
    public SelenideElement resetPassButton;


    public void clickResetPass() {
        this.resetPassButton.click();
    }
}