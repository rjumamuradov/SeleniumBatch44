package day03_WebElementsLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_LoginTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1. Bir class oluşturun: LoginTest
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //a. http://a.testaddressbook.com adresine gidiniz.

        driver.get("http://a.testaddressbook.com");

        //b. Sign in butonuna basin
        WebElement singInLink = driver.findElement(By.id("sign-in")); //sadece bulduk butonu
        singInLink.click();

        //c
        //. email textbox,password textbox, and signin button elementlerini locate

        WebElement emailTextBox= driver.findElement(By.id("session_email"));
        WebElement paswordTextBox= driver.findElement(By.id("session_password"));
        WebElement signIn=driver.findElement(By.name("commit"));




        //d
        //. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign i n)buttonunu tıklayın:
        //i. Username :
        //testtechproed@gmail.com
        emailTextBox.sendKeys("testtechproed@gmail.com");

        //ii. Password : Test1234!
        paswordTextBox.sendKeys("Test1234!");
        Thread.sleep(1700);

        signIn.click();
        //e. Expected user id nin
        //testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement girisYazisiElement= driver.findElement(By.tagName("h1"));
        System.out.println(girisYazisiElement.getText());
        String actualGirisYazisi= girisYazisiElement.getText();
        String expectedGirisYazisi="Welcome to Address Book";

        if (actualGirisYazisi.equals(expectedGirisYazisi)) System.out.println("giris yazi testi Pass");
        else System.out.println("giris FAILED");

        //f
        //. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).

        WebElement adresElement= driver.findElement(By.linkText("Addresses"));
        WebElement signOut=driver.findElement(By.linkText("Sign out"));
        System.out.println(adresElement.isDisplayed());
        if (adresElement.isDisplayed()) System.out.println("Adres goruntuleniyorsa PASS");
    else System.out.println("adres goruntulenmiyor FAILED");
    if (signOut.isDisplayed()) System.out.println("sign out da goruntuleniyor PASS");
    else System.out.println("sign outda gorutulenmiyor FAILED");

        //3. Sayfada kac tane link oldugunu bulun.
    List<WebElement> listElements = driver.findElements(By.tagName("a"));
        System.out.println();
        System.out.println("sayfada  " + listElements.size() + " link var gardas");
    }
}
