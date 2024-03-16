package org.DanCa.Clase9.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FavoritosPage extends BasePage{

    private By cameraButton = By.xpath("//a[text()='Cameras']");
    private By favIcon = By.xpath("//button[@onclick=\"wishlist.add('30');\"]");
    private By wishListButton = By.id("wishlist-total");
    private By productConfirmed = By.xpath("//div[@id=\"content\"]//tbody/tr/td/a[text()=\"Canon EOS 5D\"]");

    public FavoritosPage(WebDriver driver) {
        super(driver);
    }

    public void ingresarSeccionCamaras(){
        click(cameraButton);
    }

    public void agregarUnFavorito(){
        click(favIcon);
    }

    public void clickWishList(){
        click(wishListButton);
    }

    public boolean productIsDisplayed(){
        return isDisplayed(productConfirmed);
    }
}
