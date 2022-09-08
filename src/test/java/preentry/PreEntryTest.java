package preentry;

import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;
import pageobject.MainPage;
import user.UserOperations;

import static com.codeborne.selenide.Selenide.open;

public abstract class PreEntryTest {


    public MainPage openMainPage;
    protected UserOperations userOperations = new UserOperations();

    public PreEntryTest() {
    }

    @Before
    public void preSet() {

        openMainPage = open(MainPage.URI, MainPage.class);
    }

    @After
    //Удалить пользователя
    public void removeUser() {
        userOperations.remove();
    }

    @After
    public void closeBrowser() {
        Selenide.closeWebDriver();
    }


}