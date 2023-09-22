package WPTestCase;

import Data.DaTa;
import WPBase.LoginStaging;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class SearchStag extends LoginStaging {
    @Test(dataProvider = "keyworksearch", dataProviderClass = DaTa.class)
    public void Search(String Keys) throws InterruptedException {
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/img[1]")).click();
        LogStag("acctest2@gmail.com", "123456");
        //Click vào cục chat & đợi loading ls chat
        WebElement Cucchat = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[2]/img[1]")));
        Cucchat.click();

        //Search
        driver.findElement(By.xpath("//input[@id='Hsk-Search']")).click();
            WebElement keySearch = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='Hsk-Search']")));
            keySearch.sendKeys(Keys);
            if(Keys.length()>1){
                Thread.sleep(2000);
                    WebElement mulClick = driver.findElement(
                            By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/*[name()='svg'][1]"));
                    for (int i=0;i<3;i++){
                    mulClick.click();
                    Thread.sleep(3000);
                    }
            }
            else {
                System.out.print("Không tìm kiếm được tin nhắn nhỏ hơn 2 ký tự");
            }
    }
}
