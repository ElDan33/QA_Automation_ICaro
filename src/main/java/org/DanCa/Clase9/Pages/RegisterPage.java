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
    private By emailInputError = By.xpath("//div[contains(text(),\"E-Mail Address does not appear\")]");
    private By emailAlreadyReg = By.xpath("//div[contains(text(),\"E-Mail Address is already registered\")]");
    private By passwordInputError = By.xpath("//div[contains(text(),\"Password must be between\")]");
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

    }

    public void acceptTerms(){
        click(agreeTermsBy);
    }

    public void next(){
        click(submitBy);
    }

    public boolean emailHasError(){
        return isDisplayed(emailInputError);
    }

    public boolean emailAlreadyRegistered(){
        return isDisplayed(emailAlreadyReg);
    }

    public boolean passwordHasError(){
        return isDisplayed(passwordInputError);
    }

    public boolean warningIsDisplay(){
        return isDisplayed(warning);
    }

}
