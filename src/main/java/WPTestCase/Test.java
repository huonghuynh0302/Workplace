package WPTestCase;

import WPBase.LonginWP;
import org.openqa.selenium.By;

public class Test extends LonginWP {
    @org.testng.annotations.Test
    public void testMeeting(){
        login("huonght2@hasaki.vn","123456");
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div[1]/div[8]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"main_page\"]/div/div[2]/div/div/div[1]/div/div[1]/div/span/div/div/button")).click();
        driver.findElement(By.id("title")).sendKeys("hihi");
    }
}
