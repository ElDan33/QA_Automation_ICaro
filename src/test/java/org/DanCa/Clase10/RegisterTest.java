package org.DanCa.Clase10;

import com.github.javafaker.Faker;
import org.DanCa.Clase8.BaseTest;
import org.DanCa.Clase9.Pages.HomePage;
import org.DanCa.Clase9.Pages.NewAccountPage;
import org.DanCa.Clase9.Pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {
    @Test
    public void crearCuenta(){
        // Paso 1: levantar la página.
        HomePage homepage = new HomePage(getWebDriver());
        RegisterPage registerPage = new RegisterPage(getWebDriver());
        NewAccountPage newAccountPage = new NewAccountPage(getWebDriver());
        Faker faker = new Faker();

        getWebDriver().get("https://opencart.abstracta.us/");

        homepage.clickMyAccount();
        homepage.clickRegisterDropDown();

        registerPage.completarFormulario(
            faker.name().firstName(),
            faker.name().lastName(),
            faker.internet().emailAddress(),
            faker.phoneNumber().phoneNumber(),
            faker.internet().password()
        );

        Assert.assertTrue(newAccountPage.titleIsDisplayed());
        Assert.assertTrue(newAccountPage.successIsDisplayed());
    }
}
