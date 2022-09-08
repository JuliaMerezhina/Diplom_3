package pageobject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class MainPage {

    public static final String URI = "https://stellarburgers.nomoreparties.site";

    //"Войти в аккаунт"
    @FindBy(how = How.XPATH, using = StaticName.MAINPAGELOGBUTTON)
    private SelenideElement mainPageLogButton;

    //"Личный кабинет"
    @FindBy(how = How.XPATH, using = StaticName.MAINPAGEACCOUNTBUTTON)
    private SelenideElement mainPageAccountButton;

    //"Оформить заказ"
    @FindBy(how = How.XPATH, using = StaticName.CREATEORDERBUTTON)
    private SelenideElement createOrderButton;

    //раздел "Булки"
    @FindBy(how = How.XPATH, using = StaticName.BUNSCATEGORY)
    private SelenideElement bunsCategory; //сделать кликабельным todo

    //раздел "Соусы"
    @FindBy(how = How.XPATH, using = StaticName.SAUCESCATEGORY)
    private SelenideElement saucesCategory;

    //раздел "Начинки"
    @FindBy(how = How.XPATH, using = StaticName.FILLINGSCATEGORY)
    private SelenideElement fillingsCategory;

    //Headers category
    @FindBy(how = How.XPATH, using = StaticName.BUNSHEADER)
    private SelenideElement bunsHeader;
    @FindBy(how = How.XPATH, using = StaticName.SAUCESHEADER)
    private SelenideElement saucesHeader;
    @FindBy(how = How.XPATH, using = StaticName.FILLINGSHEADER)
    private SelenideElement fillingsHeader;

    @Step("Нажать на кнопку Личный кабинет")
    public void clickMainPageAccountButton() {
        this.mainPageAccountButton.click();
    }

    @Step("Нажать на кнопку Войти в профиль")
    public void clickMainPageLogButton() {
        this.mainPageLogButton.click();
    }

    @Step("Нажать на кнопку Оформить заказ")
    public void clickCreateOrderButton() {
        this.createOrderButton.click();
    }

    public boolean isCreateOrderButton() {
        return createOrderButton.isDisplayed();
    }

    @Step("Переход в раздел Булки")
    public void clickBuns() {
        this.bunsCategory.click();
    }

    @Step("Переход в раздел Соусы")
    public void clickSauces() {
        this.saucesCategory.click();
    }

    @Step("Переход в раздел Начинки")
    public void clickFillings() {
        this.fillingsCategory.click();
    }


    public boolean isBunsHeaderVisible() {
        return bunsHeader.isDisplayed();
    }

    public boolean isSaucesHeaderVisible() {
        return saucesHeader.isDisplayed();
    }

    public boolean isFillingsHeaderVisible() {
        return fillingsHeader.isDisplayed();
    }
}





