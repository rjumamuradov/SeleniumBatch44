package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.navigate().to("https://amazon.com");  // driver.get ile ayni islemi yapar

        driver.navigate().to("https://www.bjk.com.tr");

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();;


    }
}
