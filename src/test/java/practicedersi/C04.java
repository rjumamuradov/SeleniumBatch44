package practicedersi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04 {
    public static void main(String[] args) {
        // ...Exercise5...
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
// Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");
// Click on  Calculate under Micro Apps
        driver.findElement(By.id("calculatetest")).click();

//    Type any number in the first input
        driver.findElement(By.id("number1")).sendKeys("60");
        driver.findElement(By.id("number2")).sendKeys("90");

//    Type any number in the second input
        WebElement sonuc=driver.findElement(By.id("calculate"));
// Click on Calculate
        sonuc.click();
// Get the result
        WebElement answer = driver.findElement(By.id("answer"));

        System.out.println("sonuc.getText() = " + answer.getText());
// Print the result

    }
}
