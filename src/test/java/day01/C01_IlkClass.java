package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       // driver.get("https://www.amazon.com");
        driver.get("https://www.ebay.com");
        driver.getCurrentUrl();
        driver.getPageSource();
        driver.getTitle();
        driver.getWindowHandle();

        //Thread.sleep(5000);



        //driver.close();
    }
}
