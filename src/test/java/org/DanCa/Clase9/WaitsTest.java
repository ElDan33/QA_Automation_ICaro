package org.DanCa.Clase9;

import org.DanCa.Clase8.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class WaitsTest extends BaseTest {



    @Test
    public void Wait1(){
        getWebDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        getWebDriver().get("https://the-internet.herokuapp.com/dynamic_loading/1");

        By startBy = By.xpath("//div[@id='start']/button");
        WebElement startEl = getWebDriver().findElement(startBy);
        startEl.click();

        By helloText = By.xpath("//div[@id='finish']/h4");
        WebElement helloTextEl = getWebDriver().findElement(helloText);
        Assert.assertEquals(helloTextEl.getText(), "Hello World!");
    }

    @Test
    public void Wait2(){
        WebDriverWait wait = new WebDriverWait(getWebDriver(), Duration.ofSeconds(10));
        getWebDriver().get("https://the-internet.herokuapp.com/dynamic_loading/1");
        By startBy = By.xpath("//div[@id='start']/button");
        WebElement startEl = wait.until(ExpectedConditions.elementToBeClickable(startBy));
        startEl.click();

        By helloText = By.xpath("//div[@id='finish']/h4");
        WebElement helloTextEl = wait.until(ExpectedConditions.visibilityOfElementLocated(helloText));
        Assert.assertEquals(helloTextEl.getText(), "Hello World!");

    }

    @Test
    public void Wait3(){
        WebDriverWait wait = new WebDriverWait(getWebDriver(), Duration.ofSeconds(10));
        getWebDriver().get("https://the-internet.herokuapp.com/dynamic_loading/2");
        By startBy = By.xpath("//div[@id='start']/button");
        WebElement startEl = wait.until(ExpectedConditions.elementToBeClickable(startBy));
        startEl.click();

        By helloText = By.xpath("//div[@id='finish']/h4");
        WebElement helloTextEl = wait.until(ExpectedConditions.visibilityOfElementLocated(helloText));
        Assert.assertEquals(helloTextEl.getText(), "Hello World!");

    }

    @Test
    public void DropdownWait(){
        WebDriverWait wait = new WebDriverWait(getWebDriver(),Duration.ofSeconds(10));
        getWebDriver().get("https://the-internet.herokuapp.com/dropdown");
        By selectionBy = By.xpath("//select[@id=\"dropdown\"]");
        WebElement selectionEl = wait.until(ExpectedConditions.visibilityOfElementLocated(selectionBy));
        Select dropdown = new Select(selectionEl);


        By option1By = By.xpath("//select[@id=\"dropdown\"]/option[@value=\"1\"]");
        By option2By = By.xpath("//select[@id=\"dropdown\"]/option[@value=\"2\"]");

    }
}
