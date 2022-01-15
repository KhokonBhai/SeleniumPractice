import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;

public class BestBuy1 {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Khokon Bhai\\Desktop\\chromedriver.exe");
        System.out.println(" #######    Now my driver is working. ######");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.BestBuy.com");
        // driver.get("http://www.google.com");
        //  driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        //
        //
        Thread.sleep(6000);
        driver.findElement(By.xpath("/html/body/main/div[2]/div[5]/div/div/div[1]/div/div/div/div/button")).click();
        System.out.println("Here is line # 30.");

        String pWindow = driver.getWindowHandle();
        System.out.println("pWindow = " + pWindow);//
        Set<String> allWin = driver.getWindowHandles();

        for (String childWin : allWin) {
            if (!(childWin.equalsIgnoreCase(pWindow))) {
                driver.switchTo().window(childWin);
                System.out.println("childWin = " + childWin);
                driver.manage().window().maximize();
            }
            System.out.println("Here is line # 34.");
            Thread.sleep(5000);
            driver.findElement(By.partialLinkText("Account")).click();
            Thread.sleep(5000);
            driver.findElement(By.id("fld-e")).sendKeys("Khokoninny@gmail.com");
            Thread.sleep(5000);
            driver.findElement(By.id("fld-p1")).sendKeys("Khokon");
            Thread.sleep(5000);
            driver.findElement(By.xpath("/html/body/div[1]/div/section/main/div[2]/div[1]/div/div/div/div/div/form/div[4]/button")).click();
            Thread.sleep(5000);
            driver.navigate().back();Thread.sleep(5000);
            driver.navigate().forward();
            Thread.sleep(7000);
            driver.quit();

        }
    }
}