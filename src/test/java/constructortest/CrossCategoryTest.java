package constructortest;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import preentry.PreEntryTest;

import static org.junit.Assert.assertTrue;

public class CrossCategoryTest extends PreEntryTest {

    @Test
    @DisplayName("Cross to buns")
    public void crossBunsIsSuccess() {

        openMainPage.clickBuns();
        boolean isBuns = openMainPage.isBunsHeaderVisible();
        assertTrue("Переход к разделу Булки не произошел", isBuns);
    }

    @Test
    @DisplayName("Cross to sauce")
    public void crossSauceIsSuccess() {

        openMainPage.clickSauces();
        boolean isSauces = openMainPage.isSaucesHeaderVisible();
        assertTrue("Переход к разделу Соусы не произошел", isSauces);
    }

    @Test
    @DisplayName("Cross to fillings")
    public void crossFillingsIsSuccess() {

        openMainPage.clickFillings();
        boolean isFillings = openMainPage.isFillingsHeaderVisible();
        assertTrue("Переход к разделу Начинки не произошел", isFillings);
    }

    @Override
    public void removeUser() {
    }
}