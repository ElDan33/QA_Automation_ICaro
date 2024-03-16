package org.DanCa.StepsDefinitions;

import io.cucumber.java.es.Entonces;
import org.DanCa.Clase9.Pages.LoginPage;
import org.DanCa.Clase9.Pages.MyAccountPage;
import org.DanCa.Hooks.Hooks;
import org.testng.Assert;

public class MyAccountDefinitions {

    private MyAccountPage myAccountPage;
    private LoginPage loginpage;

    public MyAccountDefinitions(){
        this.myAccountPage = new MyAccountPage(Hooks.getWebDriver());
        this.loginpage = new LoginPage(Hooks.getWebDriver());
    }

    @Entonces("el usuario se encuentra en su cuenta")
    public void elUsuarioSeEncuentraEnSuCuenta() {
        // Paso 5: Validaciones
        Assert.assertTrue(myAccountPage.TitleIsDisplayed(), "No se ha cargado la pagina correcta");
    }

    @Entonces("el sitio lanza una advertencia de credenciales no válidas")
    public void elSitioLanzaUnaAdvertenciaDeCredencialesNoVálidas() {
        Assert.assertTrue(loginpage.ErrorMessageIsDisplayed());
    }
}
