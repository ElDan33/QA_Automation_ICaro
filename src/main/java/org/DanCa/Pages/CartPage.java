package org.DanCa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{

    private By cameraButton = By.xpath("//a[text()='Cameras']");
    private By addCartButton = By.xpath("//button[@onclick=\"cart.add('31', '1');\"]");
    private By successAdded = By.xpath("//div[contains(text(),\" Success: You have added \")]");
    private By cartButton = By.xpath("//button/span[@id=\"cart-total\"]");
    private By cartProduct = By.xpath("//td[@class=\"text-left\"]");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void ingresarSeccionCamaras(){
        click(cameraButton);
    }

    public void agregarAlCarrito(){
        click(addCartButton);
    }

    public boolean isSuccess(){
        return isDisplayed(successAdded);
    }


    public boolean productIsAdded(){
        click(cartButton);
        return isDisplayed(cartProduct);
    }

}
