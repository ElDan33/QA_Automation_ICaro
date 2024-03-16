package org.DanCa.Clase8;

import org.DanCa.Clase9.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomeTest extends BaseTest{

    @Test
    public void validarHome(){
        HomePage homepage = new HomePage(getWebDriver());

        // Paso 1: levantar la página.
        getWebDriver().get("https://opencart.abstracta.us/");

        // Paso 2: configuramos los asserts para nuestro test.
        Assert.assertTrue(homepage.inputIsDisplayed());
        Assert.assertTrue(homepage.carrouselIsDisplayed());
        Assert.assertTrue(homepage.navbarIsDisplayed());
        Assert.assertTrue(homepage.myAccountIsDisplayed());
    }


}
