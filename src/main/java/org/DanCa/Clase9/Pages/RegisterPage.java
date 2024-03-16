package org.DanCa.Clase9.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RegisterPage extends BasePage{

    private By firstNameBy = By.id("input-firstname");
    private By lastNameBy = By.id("input-lastname");
    private By emailBy = By.id("input-email");
    private By telephoneBy = By.id("input-telephone");
    private By passwordBy = By.id("input-password");
    private By confirmPassBy = By.id("input-confirm");
    private By agreeTermsBy = By.name("agree");
    private By submitBy = By.xpath("//input[@value=\"Continue\"]");

    private By lengthInputError = By.xpath("//div[contains(text(),\"must be between\")]");
    private By emailInputError = By.xpath("//div[contains(text(),\"E-Mail Address does not appear\")]");



    private By warning = By.xpath("//div[@id=\"account-register\"]/div[contains(text(),\" Warning\")]");


    public RegisterPage(WebDriver driver){
        super(driver);
    }

    public void completarFormulario(String firstname,
                              String lastname,
                              String email,
                              String telephone,
                              String password){

        sendKey(firstNameBy, firstname);
        sendKey(lastNameBy, lastname);
        sendKey(emailBy, email);
        sendKey(telephoneBy, telephone);
        sendKey(passwordBy, password);
        sendKey(confirmPassBy, password);
        click(agreeTermsBy);
        click(submitBy);
    }

    public boolean formularioCompleto(){

        if(isDisplayed(lengthInputError) || isDisplayed(warning) || isDisplayed(emailInputError)){
            return false;
        } else {
            return true;
        }
    }

}
