package org.DanCa.Clase8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginTest extends BaseTest{
    @Test
    public void loginTest(){
        // Paso 1: levantar la página.
        getWebDriver().get("https://opencart.abstracta.us/");

        // Paso 2: Click en MyAccount.
        By myAccount = By.xpath("//li/a[@title='My Account']");
        WebElement myAccountEl = getWebDriver().findElement(myAccount);
        myAccountEl.click();

        // Paso 3: Click en Login.
        By loginBy = By.xpath("//a[text()='Login']");
        WebElement loginEl = getWebDriver().findElement(loginBy);
        loginEl.click();

        // Paso 4: Hacer login (Ingresar user, pass y clickear en el boton de login).
        By mailInputBy = By.name("email");
        WebElement mailInputEl = getWebDriver().findElement(mailInputBy);
        mailInputEl.sendKeys("dante@gmail.com");

        By passInputBy = By.name("password");
        WebElement passInputEl = getWebDriver().findElement(passInputBy);
        passInputEl.sendKeys("12345");

        By buttonLoginBy = By.xpath("//input[@value='Login']");
        WebElement buttonLoginEl = getWebDriver().findElement(buttonLoginBy);
        buttonLoginEl.click();

        // Paso 5: Validaciones
        By titleBy = By.xpath("//h2[text()='My Account']");
        WebElement titleEl = getWebDriver().findElement(titleBy);

        Assert.assertTrue(titleEl.isDisplayed(), "No se ha cargado la pagina correcta.");
    }
}
