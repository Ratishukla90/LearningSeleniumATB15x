package com.testingAcademy;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KatalonTest{

@Test
@Description("Verify Katalon login page opens")
public void func1() throws InterruptedException {

     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://katalon-demo-cura.herokuapp.com/");
     Thread.sleep(1000);
     driver.findElement(By.xpath("//*[@id='btn-make-appointment']")).click();
    Thread.sleep(1000);
     driver.findElement(By.xpath("//*[@id='txt-username']")).click();
    driver.findElement(By.xpath("//*[@id='txt-username']")).sendKeys("John Doe");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@id='txt-password']")).click();
    driver.findElement(By.xpath("//*[@id='txt-password']")).sendKeys("ThisIsNotAPassword");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div/button[@id='btn-login']")).click();



 }
}