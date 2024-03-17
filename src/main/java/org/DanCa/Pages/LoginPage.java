package org.DanCa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    By mailInputBy = By.name("email");
    By passInputBy = By.name("password");
    By buttonLoginBy = By.xpath("//input[@value='Login']");
    By warningMessageBy = By.xpath("//div[contains(text(),'Warning: No match for E-Mail Address and/or Password')]");


    public LoginPage(WebDriver driver){
        super(driver);
    }

    public void setEmail(String email){
        clear(mailInputBy);
        sendKey(mailInputBy, email);
    }

    public void setPassword(String password){
        clear(passInputBy);
        sendKey(passInputBy, password);
    }

    public void clickLoginButton(){
        click(buttonLoginBy);
    }

    public Boolean ErrorMessageIsDisplayed(){
        return isDisplayed(warningMessageBy);
    }

    public void Login(String email, String password){
        setEmail(email);
        setPassword(password);
        clickLoginButton();
    }
}
