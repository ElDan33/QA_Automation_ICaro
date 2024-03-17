package org.DanCa.StepsDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.DanCa.Pages.HomePage;
import org.DanCa.Pages.LoginPage;
import org.DanCa.Pages.MyAccountPage;
import org.DanCa.Hooks.Hooks;
import org.testng.Assert;

public class LoginDefinitions {

    private HomePage homepage;
    private LoginPage loginpage;
    private MyAccountPage myAccountPage;

    public LoginDefinitions(){
        this.homepage = new HomePage(Hooks.getWebDriver());
        this.loginpage = new LoginPage(Hooks.getWebDriver());
        this.myAccountPage = new MyAccountPage(Hooks.getWebDriver());
    }

    // ########## TEST-LI001 ##########
    @Dado("que el ususario ingresa a la página de login")
    public void queElUsusarioIngresaALaPáginaDeLogin() {

        // Paso 1: levantar la página.
        Hooks.getWebDriver().get(Hooks.getProperty("url"));

        // Paso 2: Click en MyAccount.
        homepage.clickMyAccount();

        // Paso 3: Click en Login.
        homepage.clickLoginDropDown();
    }

    @Y("el usuario se loguea en la aplicación")
    public void elUsuarioSeLogueaEnLaAplicación() {
        homepage.clickMyAccount();
        homepage.clickLoginDropDown();
        loginpage.Login(Hooks.getProperty("username"), Hooks.getProperty("password"));
    }

    @Cuando("el usuario se logea con credenciales válidas")
    public void elUsuarioSeLogeaConCredencialesVálidas() {

        // Paso 4: Hacer login (Ingresar user, pass y clickear en el boton de login).
        loginpage.Login(Hooks.getProperty("username"), Hooks.getProperty("password"));
    }

    @Entonces("el usuario se encuentra en su cuenta")
    public void elUsuarioSeEncuentraEnSuCuenta() {
        // Paso 5: Validaciones
        Assert.assertTrue(myAccountPage.TitleIsDisplayed(), "No se ha cargado la pagina correcta");
    }



    // ########## TEST-LI002 ##########
    @Cuando("el usuario se logea con credenciales no válidas")
    public void elUsuarioSeLogeaConCredencialesNoVálidas() {
        loginpage.Login(Hooks.getProperty("emailX"), Hooks.getProperty("passwordX"));
    }

    @Entonces("el sitio lanza una advertencia de credenciales no válidas")
    public void elSitioLanzaUnaAdvertenciaDeCredencialesNoVálidas() {
        Assert.assertTrue(loginpage.ErrorMessageIsDisplayed());
    }


}
