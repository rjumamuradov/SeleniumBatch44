package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverGetMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        System.out.println(driver.getTitle()); //Amazon.com. Spend less. Smile more.
        System.out.println(driver.getCurrentUrl()); // https://www.amazon.com/
        System.out.println(driver.getWindowHandle()); // CDwindow-EFA721164B695DA1857ECEF036A46FE4 sayfa
        System.out.println(driver.getPageSource()); // sayfa kaynaklarini gosterir


    }
}
