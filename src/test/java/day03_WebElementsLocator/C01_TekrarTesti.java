package day03_WebElementsLocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TekrarTesti {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.navigate().to("https://youtube.com");
        String titleYoutube = driver.getTitle();
        String expectedYoutubeTitle="youtube";
        if (titleYoutube.equals(expectedYoutubeTitle)) System.out.println("Youtubetitle test is PASS");
        else System.out.println("youtubetitle test is FAILED \nactually title "+ titleYoutube);


        String actualYoutubeUrl= driver.getCurrentUrl();
        String expectedYoutubeUrl="youtube";

        if (actualYoutubeUrl.contains(expectedYoutubeUrl)) System.out.println("youtube url test is PASS");
        else System.out.println("Youtube url test is FAiLED \nactually"+actualYoutubeUrl);


        //1. Yeni bir class olusturun (TekrarTesti)
        //2.
        //Y outube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
        //(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        //3. Sayfa URL'sinin “youtube” içerip içermediğini
        //(contains) doğrulayın, içermiyorsa doğru
        //URL'yi yazdırın.
        //4. Daha sonra
        //Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");


        //5. Youtube sayfasina geri donun
        driver.navigate().back();
        //6.
        //Sayfayi yenileyin
        driver.navigate().refresh();

        //7. Amazon sayfasina donun
        driver.navigate().forward();

        //8.
        //Sayfayi tamsayfa yapin
        driver.manage().window().maximize();
        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini

        //(contains) doğrulayın, Yoksa
        //doğru başlığı(Actual Title) yazdırın.

        String actualTitleAmazon=driver.getTitle();
        String arananKelimeAmazon="Amazon";
        if (actualTitleAmazon.contains(arananKelimeAmazon)) System.out.println("Amazon title kelime testi Pass");
        else System.out.println("Amazon title kelime tetsi FAILED");


        //10.Sayfa URL'sinin
        //https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        //URL'yi yazdırın

        String actualAmazonUrl = driver.getCurrentUrl();

        String arananUrlAmazon= "https://www.amazon.com/";
        if(actualAmazonUrl.equals(arananUrlAmazon)) System.out.println("amazon url testi PASS");
        else System.out.println("url testi amazon FAILED");

        //11.
        //Sayfayi kapatin
        driver.close();

    }
}
