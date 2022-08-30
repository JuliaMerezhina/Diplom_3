package preentry;

import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;
import pageobject.MainPage;
import user.UserOperations;

import static com.codeborne.selenide.Selenide.open;

public abstract class PreEntryTest {


    protected UserOperations userOperations = new UserOperations();

    public MainPage openMainPage;

    public PreEntryTest() {
    }

    @Before
    public void preSet() {

//Configuration.timeout = 10l;
        openMainPage = open(MainPage.URI, MainPage.class);
    }

    @After
    //Удалить пользователя
    public void removeUser() {
        userOperations.remove();
    }

    public void closeBrowser() {
        Selenide.closeWindow();
    }


}