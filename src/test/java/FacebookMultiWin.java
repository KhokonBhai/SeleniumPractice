import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class FacebookMultiWin {


    public static void main(String[] args) throws InterruptedException {

        System.out.println(" #######    Now my driver is working. ######");

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Khokon Bhai\\Desktop\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
      //  driver.get("https://www.BestBuy.com");
        // driver.get("http://www.google.com");
         driver.get("https://www.facebook.com");
        driver.manage().window().maximize();



        Thread.sleep(7000);
        driver.findElement(By.name("email")).sendKeys("Khokoninny@yahoo.com");
        Thread.sleep(7000);
        driver.findElement(By.name("pass")).sendKeys("Khokon1959");

        Thread.sleep(7000);
        driver.findElement(By.name("login")).click();
        Thread.sleep(4000);
        driver.findElement(By.name("login")).click();
        System.out.println("Here is line # 34.");
        String mWindow = driver.getWindowHandle();
        Set<String> allWin = driver.getWindowHandles();
        Iterator<String> it = allWin.iterator();
        System.out.println("Here is line # 38.");

        while (it.hasNext()) {
            String childWin = it.next();
            if (!mWindow.equals(childWin)) {

                //  driver.switchTo().window(childWin);
                driver.switchTo().window(mWindow);
                Thread.sleep(12000);
                System.out.println("Here is line # 47.");
                driver.findElement(By.cssSelector("plButton-label v-ellipsis")).click();
            }
        }
    }
}

