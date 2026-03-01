package com.testingAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

@Test
public class ExplicitwaitTest extends CommonUtility{

    // private static final Logger log = LoggerFactory.getLogger(ExplicitwaitTest.class);

    public void login() {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        openBrowser(driver,"https://app.vwo.com/#/login");

        driver.findElement(By.cssSelector("input[class='text-input W(100%)']")).click();
        driver.findElement(By.cssSelector("input[class='text-input W(100%)']")).sendKeys("admin@admin.com");


        driver.findElement(By.cssSelector("#login-password")).click();
        driver.findElement(By.cssSelector("#login-password")).sendKeys("admin");

        driver.findElement(By.cssSelector("#js-login-btn")).click();

        String xpathErrorMsg ="#js-notification-box-msg";

        WebElement element=explicitWait(driver,10,xpathErrorMsg);

        String errorMessage=element.getText();

        System.out.println(errorMessage);

        Assert.assertEquals(errorMessage,"Your email, password, IP address or location did not match");

        closeBrowser(driver);
    }
}
