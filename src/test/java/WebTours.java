import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTours {


    public static void main(String[] args) throws InterruptedException {

        System.out.println(" #######    Now my driver is working. ######");

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Khokon Bhai\\Desktop\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.BestBuy.com");
        // driver.get("http://www.google.com");
      //  driver.get("http://www.newtours.demoout.com/");
      // driver.get("http://demo.guru99.com/test/newtours/");

        driver.manage().window().maximize();


    }
}