package practicedersi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03 {
    public static void main(String[] args) {
        // ...Exercise3...
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

// go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().deleteAllCookies();
        //driver.findElement(By.xpath("//a[text()='Tamam']")).click();
//fill the firstname
        driver.findElement(By.name("firstname")).sendKeys("Seyfi");
//fill the firstname
        driver.findElement(By.name("lastname")).sendKeys("Abi");

//check the gender
        driver.findElement(By.id("sex-0")).click();


//check the experience
        driver.findElement(By.id("exp-0")).click();
//fill the date
        driver.findElement(By.id("datepicker")).sendKeys("24.01.2022");
//choose your profession -> Automation Tester
        driver.findElement(By.id("profession-1")).click();


//choose your tool -> Selenium Webdriver
        driver.findElement(By.id("tool-2")).click();

//choose your continent -> Antartica
        driver.findElement(By.id("continents")).click();

//choose your command  -> Browser Commands
//click submit button

    }
}
