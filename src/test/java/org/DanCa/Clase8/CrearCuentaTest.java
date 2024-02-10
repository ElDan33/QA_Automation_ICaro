package org.DanCa.Clase8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CrearCuentaTest extends BaseTest{
    @Test
    public void crearCuenta(){
        // Paso 1: levantar la página.
        getWebDriver().get("https://opencart.abstracta.us/");

        // Paso 2: Click en MyAccount.
        By myAccount = By.xpath("//li/a[@title='My Account']");
        WebElement myAccountEl = getWebDriver().findElement(myAccount);
        myAccountEl.click();

        // Paso 3: Click en Register.
        By registerBy = By.xpath("//a[text()='Register']");
        WebElement registerEl = getWebDriver().findElement(registerBy);
        registerEl.click();

        // Paso 4: Completar formulario de registro.
        By nameInputBy = By.name("firstname");
        WebElement nameInputEl = getWebDriver().findElement(nameInputBy);
        nameInputEl.sendKeys("Jhoe");

        By lastnameInputBy = By.name("lastname");
        WebElement lastnameInputEl = getWebDriver().findElement(lastnameInputBy);
        lastnameInputEl.sendKeys("Wierbrauer");


        By emailInputBy = By.name("email");
        WebElement emailInputEl = getWebDriver().findElement(emailInputBy);
        emailInputEl.sendKeys("jhoe_wierbrauer@gmail.com");


        By telephoneInputBy = By.name("telephone");
        WebElement telephoneInputEl = getWebDriver().findElement(telephoneInputBy);
        telephoneInputEl.sendKeys("333444555");


        By passwordInputBy = By.name("password");
        WebElement passwordInputEl = getWebDriver().findElement(passwordInputBy);
        passwordInputEl.sendKeys("123456");


        By confirmPassBy = By.name("confirm");
        WebElement confirmPassEl = getWebDriver().findElement(confirmPassBy);
        confirmPassEl.sendKeys("123456");


        By agreeInputBy = By.name("agree");
        WebElement agreeInputEl = getWebDriver().findElement(agreeInputBy);
        agreeInputEl.click();


        By continueButtonBy = By.xpath("//input[@value='Continue']");
        WebElement continueButtonEl = getWebDriver().findElement(continueButtonBy);
        continueButtonEl.click();

        By newAccCreatedBy = By.xpath("//p[text()='Congratulations! Your new account has been successfully created!']");
        WebElement newAccCreatedEl = getWebDriver().findElement(newAccCreatedBy);

        Assert.assertTrue(newAccCreatedEl.isDisplayed());
    }
}
