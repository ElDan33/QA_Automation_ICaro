package org.DanCa.Clase8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



public class HomeTest extends BaseTest{

    @Test
    public void validarHome(){
        // Paso 1: levantar la página.
        getWebDriver().get("https://opencart.abstracta.us/");

        // Paso 2: levantar la aserción
        By inputBy = By.name("search");
        // By inputBy2 = By.xpath("//input[@name='search']");
        By carrousel = By.id("slideshow0");
        By navbar = By.id("menu");
        By myAccount = By.xpath("//li/a[@title='My Account']");

        WebElement inputEl = getWebDriver().findElement(inputBy);
        WebElement carrouselEl = getWebDriver().findElement(carrousel);
        WebElement navbarEl = getWebDriver().findElement(inputBy);
        WebElement myAccountEl = getWebDriver().findElement(inputBy);

        Assert.assertTrue(inputEl.isDisplayed(), "No se visualizo el elemento.");
        Assert.assertTrue(carrouselEl.isDisplayed(), "No se visualizo el elemento.");
        Assert.assertTrue(navbarEl.isDisplayed(), "No se visualizo el elemento.");
        Assert.assertTrue(myAccountEl.isDisplayed(), "No se visualizo el elemento.");
    }


}
