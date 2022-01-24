package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_GetMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());

        String actualTitle= driver.getTitle();
        String arananKelime="Amazon";

if (actualTitle.contains(arananKelime)){
    System.out.println(" Title test is Pass");
}
else {
    System.out.println("Title test is Failed");

}
        System.out.println("sayfanin title "+ actualTitle);

String actualUrl= driver.getCurrentUrl();
String arananUrl="amazon";

if(actualUrl.contains(arananUrl)) System.out.println("url test is pass");
else System.out.println("url test is failed");

// handdle degeri yaz

        System.out.println(driver.getWindowHandle());



// aran kelime alisverir  page sourceda

String actualSource= driver.getPageSource();
String aranaSource="alisveris";


if (actualSource.contains(aranaSource)) System.out.println("sayfa kaynagi testi pass");
else System.out.println("kaynak testi failed ");


driver.close();







    }
}
