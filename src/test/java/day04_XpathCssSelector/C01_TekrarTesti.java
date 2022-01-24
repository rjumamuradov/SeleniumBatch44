package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_TekrarTesti {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1. Bir class oluşturun :
        //AmazonSearchTest
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //a
        //.amazon web sayfasına gidin. https:// amazon .
        driver.get("https://www.amazon.com");

        //b. Search(ara) “city bike”
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);
        //aramaKutusu.submit();
        //aramaKutusu.click();

        //c.
        //Amazon 'da görüntülenen ilgili sonuçların sayısını yazdırın

       // List<WebElement> sonucYazisi=driver.findElements(By.className("a-section a-spacing-small a-spacing-top-small"));
        //System.out.println(sonucYazisi.size());
        WebElement sonucYazisi=driver.findElement(By.className("sg-col-inner"));
        System.out.println(sonucYazisi.getText());

                //d. “Shopping” e tıklayın.
        //e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

        WebElement ilkUrun= driver.findElement(By.className("s-image"));
        ilkUrun.click();

    }
}
