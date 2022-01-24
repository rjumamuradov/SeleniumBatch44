package practicedersi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02 {
    public static void main(String[] args) {

        //  ...Exercise2...
//  1-driver olusturalim
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//  2-java class'imiza chromedriver.exe'yi tanitalim

//  3-driver'in tum ekrani kaplamasini saglayalim
        driver.manage().window().maximize();
//  4-driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
//  5-"sahibinden.com" adresine gidelim
        driver.get("https://www.sahibinden.com");
//  6-bu web adresinin sayfa basligini(title) ve adres(url)ini alalim
        String sahibindenTitle= driver.getTitle();
        String sahibindenUrl=driver.getCurrentUrl();

        System.out.println("shbn title"+ sahibindenTitle);
        System.out.println("shbn url : "+ sahibindenUrl);


//  7-title ve url'nin "Oto" kelimesinin icerip icermedigini kontrol edelim
        if (sahibindenTitle.contains("Oto") && sahibindenUrl.contains("Oto")) System.out.println(" title oto iceriyo test PASS");
        else System.out.println("title Oto icermiyor FAILED");
        if (sahibindenUrl.contains("Oto")) System.out.println("url oto iceriyo test PASS");
        else System.out.println("Oto url icermiyor FAILED");

//  8-Ardindan "gittigidiyor.com" adresine gidelim
        driver.get("https://www.gittigidiyor.com");

//  9-bu adresin basligini alalim ve "Sitesi" kelismesini icerip icermedigini
//    kontrol edelim
        String gittiTitle = driver.getTitle();
        boolean isTrue=driver.getTitle().contains("Sitesi");
        if (isTrue)
            System.out.println("test is PASS");
        else System.out.println("test is FAILED");

//  10-Bi onceki web sayfamiza geri donelim
        driver.navigate().back();

//  11-sayfayi yenileyelim
        driver.navigate().refresh();
//  12-Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
        driver.navigate().forward();
        driver.close();
//  13-En son adim olarak butun sayfalarimizi kapatmis olalim
    }
}
