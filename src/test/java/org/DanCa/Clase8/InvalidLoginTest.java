package org.DanCa.Clase8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLoginTest extends BaseTest{
    @Test
    public void loginTest() {
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
        passInputEl.sendKeys("123456");

        By buttonLoginBy = By.xpath("//input[@value='Login']");
        WebElement buttonLoginEl = getWebDriver().findElement(buttonLoginBy);
        buttonLoginEl.click();

        By warningMessageBy = By.xpath("//div[text()=' Warning: No match for E-Mail Address and/or Password.']");
        WebElement warningMessageEl = getWebDriver().findElement(warningMessageBy);

        Assert.assertTrue(warningMessageEl.isDisplayed());
    }
}
