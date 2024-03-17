package org.DanCa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class NewAccountPage extends BasePage{
    public NewAccountPage(WebDriver driver) {
        super(driver);
    }

    private By titleBy = By.xpath("//h1[text()=\"Account\"]");
    private By successBy = By.xpath("//p[contains(text(),\"Congratulations!\")]");

    public boolean titleIsDisplayed(){
        return isDisplayed(titleBy);
    }

    public boolean successIsDisplayed() {
        return isDisplayed(successBy);
    }

}
