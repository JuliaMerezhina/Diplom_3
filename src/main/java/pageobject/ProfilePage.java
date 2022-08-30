package pageobject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProfilePage {

    //Логотип
    @FindBy(xpath = StaticName.LOGO)
    public static SelenideElement logo;

    //"Выход"
    @FindBy(how = How.XPATH, using = StaticName.LOGOUT)
    public SelenideElement logout;

    public void clickLogoButton() {
        logo.click();
    }

    //Клик по кнопке "Выход"
    public void clickLogoutButton() {
        this.logout.click();
    }

    //Отображение кнопки "Выход"
    public boolean isLogoutButton() {
        return logout.isDisplayed();
    }
}