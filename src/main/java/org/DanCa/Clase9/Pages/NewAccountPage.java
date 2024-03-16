package org.DanCa.Clase9.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountPage extends BasePage{

    public NewAccountPage(WebDriver driver) {
        super(driver);
    }

    private By titleBy = By.xpath("//h1[text()=\"Account\"]");
    private By successBy = By.xpath("//p[contains(text(),\"Your new account has been successfully created\")]");

    public Boolean titleIsDisplayed(){
        return isDisplayed(titleBy);
    }

    public Boolean successIsDisplayed() {
        return isDisplayed(successBy);
    }
}
