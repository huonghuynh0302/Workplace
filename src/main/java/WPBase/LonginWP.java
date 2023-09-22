package WPBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import java.time.Duration;

public class LonginWP {
    public WebDriver driver;
    @BeforeMethod
    public void setup(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://qcwork.inshasaki.com/");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void out(){
        //driver.quit();
}
    public void login(String userName, String password) {
        driver.findElement(By.xpath("//*[@id=\"upsertForm_email\"]")).sendKeys(userName);
        driver.findElement(By.id("upsertForm_password")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"upsertForm\"]/div[3]/div/div/div/div/button/span")).click();
    }
}
