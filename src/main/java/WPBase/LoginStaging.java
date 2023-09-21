package WPBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginStaging {
    public WebDriver driver;
    @BeforeMethod
    public void setup(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://staging.hasaki.vn");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void out(){
        driver.quit();
    }
    public void LogStag (String mail, String pass){
        driver.findElement(By.id("username")).sendKeys(mail);
        driver.findElement(By.id("password")).sendKeys(pass);
        driver.findElement(By.xpath("//button[contains(text(),'Đăng nhập')]")).click();
    }
//    @Test
//    public void TC() throws InterruptedException {
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("(//img[@class='_icon_iq4kl_47 loading'])[1]")).click();
//        LogStag("acctest2@gmail.com","123456");
//    }
}
