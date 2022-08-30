package pageobject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class MainPage {

    public static final String URI = "https://stellarburgers.nomoreparties.site";

    //"Войти в аккаунт"
    @FindBy(how = How.XPATH, using = StaticName.MAINPAGELOGBUTTON)
    public SelenideElement mainPageLogButton;

    //"Личный кабинет"
    @FindBy(how = How.XPATH, using = StaticName.MAINPAGEACCOUNTBUTTON)
    public SelenideElement mainPageAccountButton;

    //"Оформить заказ"
    @FindBy(how = How.XPATH, using = StaticName.CREATEORDERBUTTON)
    public SelenideElement createOrderButton;

    //раздел "Булки"
    @FindBy(how = How.XPATH, using = StaticName.BUNSCATEGORY)
    public SelenideElement bunsCategory; //сделать кликабельным todo

    //раздел "Соусы"
    @FindBy(how = How.XPATH, using = StaticName.SAUCESCATEGORY)
    public SelenideElement saucesCategory;

    //раздел "Начинки"
    @FindBy(how = How.XPATH, using = StaticName.FILLINGSCATEGORY)
    public SelenideElement fillingsCategory;

    //Headers category
    @FindBy(how = How.XPATH, using = StaticName.BUNSHEADER)
    private SelenideElement bunsHeader;
    @FindBy(how = How.XPATH, using = StaticName.SAUCESHEADER)
    private SelenideElement saucesHeader;
    @FindBy(how = How.XPATH, using = StaticName.FILLINGSHEADER)
    private SelenideElement fillingsHeader;

    public void clickMainPageAccountButton() {
        this.mainPageAccountButton.click();
    }

    public void clickMainPageLogButton() {
        this.mainPageLogButton.click();
    }

    public void clickCreateOrderButton() {
        this.createOrderButton.click();
    }

    public boolean isCreateOrderButton() {
        return createOrderButton.isDisplayed();
    }

    public void clickBuns() {
        this.bunsCategory.click();
    }

    public void clickSauces() {
        this.saucesCategory.click();
    }

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





