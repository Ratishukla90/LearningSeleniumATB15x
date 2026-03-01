package com.testingAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SvgProjectTest extends CommonUtility {

    @Test
    public void miniMac(){

        WebDriver driver=new ChromeDriver();

        openBrowser(driver,"https://www.flipkart.com/search?q=macmini&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");

         driver.findElement(By.cssSelector(".Vy9RSP")).click();

         // click on search icon
         driver.findElement(By.xpath("(//*[name()='svg'])[1]")).click();

         List<WebElement> PriceElements= driver.findElements(By.xpath("//*[contains(@data-id,\"MPC\")]/div/a[3]/div/div[1]"));

         int cheap=Integer.MAX_VALUE;
        for(WebElement priceElement:PriceElements){
            String priceText = priceElement.getText().replace("₹","").replace(",","");
            int priceTextInt=0;

            if(!(priceText.equalsIgnoreCase("Price: Not Available"))){
                 priceTextInt = Integer.parseInt(priceText);
                if(priceTextInt<cheap){
                cheap=priceTextInt;
           }else {
                    System.out.println("Price: Not Available");
                }
            }
        }
        System.out.println(cheap);





    }
}
