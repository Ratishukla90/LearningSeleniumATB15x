
package com.testingAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TTA_bankTest {

    @Test
    public void transfer() throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tta-bank-digital-973242068062.us-west1.run.app/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Sign Up']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='John Doe']")).click();
        driver.findElement(By.xpath("//input[@placeholder='John Doe']")).sendKeys("John Doe");

        driver.findElement(By.xpath("//input[@placeholder='you@example.com']")).click();
        driver.findElement(By.xpath("//input[@placeholder='you@example.com']")).sendKeys("you@example.com");

        driver.findElement(By.xpath("//input[@type=\"password\"]")).click();
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("password");

        driver.findElement(By.xpath("//*[text()='Create Account']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Transfer Funds']")).click();

        driver.findElement(By.xpath("//*[@type='number']")).click();
        driver.findElement(By.xpath("//*[@type='number']")).sendKeys("5000");

        driver.findElement(By.xpath("//*[text()=\"Continue\"]")).click();
        driver.findElement(By.xpath("//*[text()='Confirm Transfer']")).click();


        driver.findElement(By.xpath("//*[text()='Dashboard']")).click();

        String totalAmount=driver.findElement(By.xpath("//*[text()=\"Total Balance\"]/following-sibling::h3")).getText();

        Assert.assertEquals(totalAmount,"$45,000.00");

        driver.quit();

    }


}
