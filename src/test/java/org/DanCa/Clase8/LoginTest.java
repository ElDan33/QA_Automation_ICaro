package org.DanCa.Clase8;

import org.DanCa.Clase9.Pages.HomePage;
import org.DanCa.Clase9.Pages.LoginPage;
import org.DanCa.Clase9.Pages.MyAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest{
    @Test
    public void loginTest(){
        HomePage homepage = new HomePage(getWebDriver());
        LoginPage loginPage = new LoginPage(getWebDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getWebDriver());

        // Paso 1: levantar la página.
        getWebDriver().get("https://opencart.abstracta.us/");

        // Paso 2: Click en MyAccount.
        homepage.clickMyAccount();

        // Paso 3: Click en Login.
        homepage.clickLoginDropDown();

        // Paso 4: Hacer login (Ingresar user, pass y clickear en el boton de login).
        loginPage.Login("dante@gmail.com", "12345");

        // Paso 5: Validaciones
        Assert.assertTrue(myAccountPage.TitleIsDisplayed(), "No se ha cargado la pagina correcta");

    }
}
