package pageobject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProfilePage {

    //Логотип
    @FindBy(xpath = StaticName.LOGO)
    private static SelenideElement logo;

    //"Выход"
    @FindBy(how = How.XPATH, using = StaticName.LOGOUT)
    private SelenideElement logout;

    public void clickLogoButton() {
        logo.click();
    }

    @Step("Нажать на кнопку Выход")
    //Клик по кнопке "Выход"
    public void clickLogoutButton() {
        this.logout.click();
    }

    @Step("Отображение кнопки Выход")
    //Отображение кнопки "Выход"
    public boolean isLogoutButton() {
        return logout.isDisplayed();
    }
}