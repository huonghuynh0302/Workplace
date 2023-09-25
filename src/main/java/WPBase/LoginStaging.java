package WPBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
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
//        driver.findElement(By.xpath("(//img[@class='_icon_iq4kl_47 loading'])[1]")).click();
//        LogStag("acctest2@gmail.com", "123456");
//
//        //Click vào cục chat & đợi loading ls chat
//        WebElement Cucchat = new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@class='_icon_iq4kl_47 loading'])[1]")));
//        Cucchat.click();
//    }
}
