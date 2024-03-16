package org.DanCa.StepsDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.DanCa.Clase9.Pages.HomePage;
import org.DanCa.Clase9.Pages.MyAccountPage;
import org.DanCa.Clase9.Pages.NewAccountPage;
import org.DanCa.Clase9.Pages.RegisterPage;
import org.DanCa.Hooks.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CreateAccountDefinitions {

    HomePage home;
    RegisterPage register;
    NewAccountPage newAccountPage;

    CreateAccountDefinitions(){
        this.home = new HomePage(Hooks.getWebDriver());
        this.register = new RegisterPage(Hooks.getWebDriver());
        this.newAccountPage = new NewAccountPage(Hooks.getWebDriver());
    }

    @Dado("un usuario no registrado que desea crear una cuenta en la plataforma")
    public void unUsuarioNoRegistradoQueDeseaCrearUnaCuentaEnLaPlataforma() {
        // Paso 1: levantar la página.
        Hooks.getWebDriver().get(Hooks.getProperty("url"));

        // Paso 2: Click en MyAccount.
        home.clickMyAccount();

        // Paso 3: Click en Register.
        home.clickRegisterDropDown();

    }

    @Cuando("completa adecuadamente el formulario de registro")
    public void completaAdecuadamenteElFormularioDeRegistro() {

        // Paso 4: Completar formulario de registro.
        register.completarFormulario(
                Hooks.getProperty("firstnameV"),
                Hooks.getProperty("lastnameV"),
                Hooks.getProperty("emailV"),
                Hooks.getProperty("telephoneV"),
                Hooks.getProperty("passwordV")
        );

    }

    @Entonces("la cuenta se crea satisfactoriamente")
    public void laCuentaSeCreaSatisfactoriamente() {
        Assert.assertFalse(register.formularioCompleto());
        Assert.assertTrue(newAccountPage.titleIsDisplayed());
        Assert.assertTrue(newAccountPage.successIsDisplayed());
    }

    @Cuando("completa no adecuadamente el formulario de registro")
    public void completaNoAdecuadamenteElFormularioDeRegistro() {
        register.completarFormulario(
                Hooks.getProperty("firstnameX"),
                Hooks.getProperty("lastnameX"),
                Hooks.getProperty("emailX"),
                Hooks.getProperty("telephoneX"),
                Hooks.getProperty("passwordX")
        );
    }

    @Entonces("el sistema muestra un mensaje de error al intentar crear la cuenta")
    public void elSistemaMuestraUnMensajeDeErrorAlIntentarCrearLaCuenta() {
        Assert.assertFalse(register.formularioCompleto());
    }
}
