package org.DanCa.StepsDefinitions;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.DanCa.Pages.HomePage;
import org.DanCa.Hooks.Hooks;
import org.testng.Assert;

public class HomeDefinitions {

    private HomePage homepage;

    public HomeDefinitions() {
        this.homepage = new HomePage(Hooks.getWebDriver());
    }

    // ########## TEST-HM001 ##########
    @Dado("que el usuario ingresa a la página de inicio")
    public void queElUsuarioIngresaAlaPaginaDeInicio() {
        Hooks.getWebDriver().get(Hooks.getProperty("url"));
    }

    @Entonces("se verifica que se muestre correctamente la página de inicio")
    public void seVerificaQueSeMuestreCorrectamenteLaPáginaDeInicio() {
        Assert.assertTrue(homepage.inputIsDisplayed());
        Assert.assertTrue(homepage.carrouselIsDisplayed());
        Assert.assertTrue(homepage.navbarIsDisplayed());
        Assert.assertTrue(homepage.myAccountIsDisplayed());
    }
}
