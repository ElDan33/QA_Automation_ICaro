package org.DanCa.StepsDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.DanCa.Pages.HomePage;
import org.DanCa.Pages.NewAccountPage;
import org.DanCa.Pages.RegisterPage;
import org.DanCa.Hooks.Hooks;
import org.testng.Assert;

public class CreateAccountDefinitions {

    Faker faker = new Faker();
    String ffname = faker.name().firstName();
    String flname = faker.name().lastName();
    String femail = faker.internet().emailAddress();
    String ftelphone = faker.phoneNumber().phoneNumber();
    String fpassword = faker.internet().password();

    HomePage home;
    RegisterPage register;
    NewAccountPage newAccountPage;

    public CreateAccountDefinitions(){
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


    // ########## TEST-CA001 ##########
    @Cuando("completa adecuadamente el formulario de registro")
    public void completaAdecuadamenteElFormularioDeRegistro() {

        // Paso 4: Completar formulario de registro.
        register.completarFormulario(
                ffname,
                flname,
                femail,
                ftelphone,
                fpassword
        );
        register.acceptTerms();
        register.next();
    }

    @Entonces("la cuenta se crea satisfactoriamente")
    public void laCuentaSeCreaSatisfactoriamente() {
        Assert.assertTrue(newAccountPage.titleIsDisplayed());
        Assert.assertTrue(newAccountPage.successIsDisplayed());
    }



    // ########## TEST-CA002 ##########
    @Cuando("no completa adecuadamente el campo de email")
    public void noCompletaAdecuadamenteElCampoDeEmail() {
        register.completarFormulario(
                Hooks.getProperty("firstnameX"),
                Hooks.getProperty("lastnameX"),
                Hooks.getProperty("emailX"),
                Hooks.getProperty("telephoneX"),
                Hooks.getProperty("password")
        );
        register.acceptTerms();
        register.next();
    }

    @Entonces("el sistema muestra un mensaje de error en el campo de email")
    public void elSistemaMuestraUnMensajeDeErrorEnElCampoDeEmail() {
        Assert.assertTrue(register.emailHasError());
    }



    // ########## TEST-CA003 ##########
    @Cuando("ingresa un mail ya existente")
    public void ingresaUnMailYaExistente() {
        register.completarFormulario(
                Hooks.getProperty("firstnameX"),
                Hooks.getProperty("lastnameX"),
                Hooks.getProperty("emailReg"),
                Hooks.getProperty("telephoneX"),
                Hooks.getProperty("password")
        );
        register.acceptTerms();
        register.next();
    }

    @Entonces("el sistema muestra un mensaje de alerta de mail ya registrado")
    public void elSistemaMuestraUnMensajeDeAlertaDeMailYaRegistrado() {
        Assert.assertTrue(register.emailAlreadyRegistered());
    }



    // ########## TEST-CA004 ##########
    @Cuando("ingresa una password incorrecta")
    public void ingresaUnaPasswordIncorrecta() {
        register.completarFormulario(
                ffname,
                flname,
                femail,
                ftelphone,
                Hooks.getProperty("passwordX")
        );
        register.acceptTerms();
        register.next();
    }

    @Entonces("el sistema muestra un mensaje de error en el campo de password")
    public void elSistemaMuestraUnMensajeDeErrorEnElCampoDePassword() {
        Assert.assertTrue(register.passwordHasError());
    }



    // ########## TEST-CA005 ##########
    @Cuando("no acepta los términos y condiciones de la plataforma")
    public void noAceptaLosTérminosYCondicionesDeLaPlataforma() {
        register.completarFormulario(
                ffname,
                flname,
                femail,
                ftelphone,
                fpassword
        );
        register.next();
    }

    @Entonces("el sistema muestra un mensaje alertando que debe aceptar los términos de la plataforma")
    public void elSistemaMuestraUnMensajeAlertandoQueDebeAceptarLosTérminosDeLaPlataforma() {
        Assert.assertTrue(register.warningIsDisplay());
    }
}
