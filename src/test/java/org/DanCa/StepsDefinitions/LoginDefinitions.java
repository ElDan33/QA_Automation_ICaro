package org.DanCa.StepsDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import org.DanCa.Clase9.Pages.HomePage;
import org.DanCa.Clase9.Pages.LoginPage;
import org.DanCa.Hooks.Hooks;

public class LoginDefinitions {

    private HomePage homepage;
    private LoginPage loginpage;

    public LoginDefinitions(){
        this.homepage = new HomePage(Hooks.getWebDriver());
        this.loginpage = new LoginPage(Hooks.getWebDriver());
    }
    @Dado("que el ususario ingresa a la página de login")
    public void queElUsusarioIngresaALaPáginaDeLogin() {

        // Paso 1: levantar la página.
        Hooks.getWebDriver().get(Hooks.getProperty("url"));

        // Paso 2: Click en MyAccount.
        homepage.clickMyAccount();

        // Paso 3: Click en Login.
        homepage.clickLoginDropDown();
    }

    @Cuando("el usuario se logea con credenciales válidas")
    public void elUsuarioSeLogeaConCredencialesVálidas() {

        // Paso 4: Hacer login (Ingresar user, pass y clickear en el boton de login).
        loginpage.Login(Hooks.getProperty("username"), Hooks.getProperty("password"));
    }

    @Cuando("el usuario se logea con credenciales no válidas")
    public void elUsuarioSeLogeaConCredencialesNoVálidas() {
        loginpage.Login("dante@gmail", "1234533");
    }


    @Y("el usuario se loguea en la aplicación")
    public void elUsuarioSeLogueaEnLaAplicación() {
        homepage.clickMyAccount();
        homepage.clickLoginDropDown();
        loginpage.Login(Hooks.getProperty("username"), Hooks.getProperty("password"));
    }
}
