package com.testingAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonUtility {

    public void openBrowser(WebDriver driver,String url) {
        driver.manage().window().maximize();

        driver.get(url);
    }
    public WebElement explicitWait(WebDriver driver, int  timeout,String xpath) {

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(xpath)));
         System.out.println(element);
        return element;
    }

    public void closeBrowser(WebDriver driver) {
        driver.quit();
    }


}
