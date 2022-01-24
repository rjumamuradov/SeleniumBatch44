package day02_driverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_ManageWindows {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        driver.manage().window().setPosition(new Point(50,50));
        driver.manage().window().setSize(new Dimension(179,137));

        int xKordinati= driver.manage().window().getPosition().getX();
        int yKordinati=driver.manage().window().getPosition().getY();
        int genislik=driver.manage().window().getSize().getWidth();
        int uzunluk=driver.manage().window().getSize().getHeight();

        if (xKordinati==0 && yKordinati==0&& genislik==300&&uzunluk==500) System.out.println("olceklendirme testi PASS");
        else System.out.println("olck testi FAILED");




driver.close();







    }
}
