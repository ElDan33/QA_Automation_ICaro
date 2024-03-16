package org.DanCa.Clase9.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage{

    private By inputBy = By.name("search");
    // By inputBy2 = By.xpath("//input[@name='search']");
    private By carrouselBy = By.id("slideshow0");
    private By navbarBy = By.id("menu");
    private By myAccountBy = By.xpath("//li/a[@title='My Account']");
    private By loginBy = By.xpath("//a[text()='Login']");

    private By registerBy = By.xpath("//a[text()=\"Register\"]");


    public HomePage(WebDriver driver){
        super(driver);
    }

    public Boolean inputIsDisplayed(){
        return isDisplayed(inputBy);
    }

    public Boolean carrouselIsDisplayed(){
        return isDisplayed(carrouselBy);
    }

    public Boolean navbarIsDisplayed(){
        return isDisplayed(navbarBy);
    }

    public Boolean myAccountIsDisplayed(){
        return isDisplayed(myAccountBy);
    }

    public void clickMyAccount(){
        click(myAccountBy);
    }

    public void clickLoginDropDown(){
        click(loginBy);
    }

    public void clickRegisterDropDown(){
        click(registerBy);
    }
}
