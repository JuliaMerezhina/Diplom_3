package pageobject;

public class StaticName {

    /**
     * LoginPage
     */
    static final String REGLINK = ".//a[@href='/register']";

    static final String LOGININPUT = ".//button[@class='button_button__33qZ0 " +
            "button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']";

    static final String ENTERTEXT = "//div[@class='Auth_login__3hAey']//h2";

    static final String EMAILINPUT = ".//fieldset[1]//input[@name='name']";

    static final String PASSWORDINPUT = ".//input[@type='password']";

    static final String ACCOUNTBUTTON = ".//a[@href='/account']";

    static final String FORGOTPASSWORD = ".//a[@href='/forgot-password']";

    /**
     * MainPage
     */

    static final String MAINPAGELOGBUTTON = "//*[@id=\"root\"]/div/main/section[2]/div/button";

    static final String MAINPAGEACCOUNTBUTTON = ".//a[@href='/account']";

    static final String CREATEORDERBUTTON = "//*[@id=\"root\"]/div/main/section[2]/div/button";

    static final String BUNSCATEGORY = "//*[@id=\"root\"]/div/main/section[1]/div[2]/h2[1]";

    static final String SAUCESCATEGORY = ".//span[contains(text(),'Соусы')]";

    static final String FILLINGSCATEGORY = ".//span[contains(text(),'Начинки')]";

    static final String BUNSHEADER = ".//h2[text()='Булки']";

    static final String SAUCESHEADER = ".//h2[text()='Соусы']";

    static final String FILLINGSHEADER = ".//h2[text()='Начинки']";

    /**
     * ProfilePage
     */

    static final String LOGO = "//div[@class='AppHeader_header__logo__2D0X2']";

    static final String LOGOUT = "//*[@id=\"root\"]/div/main/div/nav/ul/li[3]/button";

    /**
     * RegistrationPage
     */


    static final String NAMEBUTTON = "//*[@id=\"root\"]/div/main/div/form/fieldset[1]/div/div/input";
    static final String EMAILBUTTON = "//*[@id=\"root\"]/div/main/div/form/fieldset[2]/div/div/input";
    static final String PASSWORDBUTTON = ".//input[@type='password']";
    static final String INCORRECTPASSWORDMESSAGE = ".//p[@class='input__error text_type_main-default']";
    static final String REGISTRATIONBUTTON = "//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx " +
            "button_button_size_medium__3zxIa']";
    static final String REGISTRATIONPAGEBUTTON = ".//a[@href='/login']";

    static final String RESETPASSBUTTON = ".//a[@href='/login']";


}
