package com.java.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class

FirstSeleniumTest {

    public static void main(String[] args) throws InterruptedException {


            System.out.println(" #######    Now my driver is working. ######");

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Khokon Bhai\\Desktop\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();
        driver.get("https://www.BestBuy.com");
           // driver.get("http://www.google.com");
          //  driver.get("https://www.facebook.com");
            driver.manage().window().maximize();

           //  driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div[2]/div[2]/input")).sendKeys("Rana.");

          //    driver.findElement(By.name("email")).sendKeys("KhokonBhai@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Khokon");
        Thread.sleep(20000);
        driver.findElement(By.name("login")).click();
        Thread.sleep(20000);
      //  driver.findElement(By.id("u_0_g_W5")).click();
        }
    }
