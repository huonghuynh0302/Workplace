package WPTestCase;

import WPBase.LonginWP;
import Data.DaTa;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Votes extends LonginWP {
    @Test(dataProvider = "VoteVote", dataProviderClass = DaTa.class)
    public void TC1(String content, String question) throws InterruptedException {
        login("huonght2@hasaki.vn","123456");
        driver.findElement(By.xpath("//span[normalize-space()='Group QC']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//strong[contains(text(),'Tham khảo ý kiến')]")).click();
        //Điền vào popup
        driver.findElement(By.xpath("//div[@class='block_input_data_post']//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']")).sendKeys(content);
        driver.findElement(By.xpath("//input[@placeholder='Nhập câu hỏi']")).sendKeys(question);
        //Click button
        driver.findElement(By.xpath("//div[@class='block_btn_post_news']")).click();
    }

    @Test(dataProvider = "VoteVote2", dataProviderClass = DaTa.class)
    public void TC2(String content, String question1, String question2) throws InterruptedException {
        login("huonght2@hasaki.vn","123456");
        driver.findElement(By.xpath("//span[normalize-space()='Group QC']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//strong[contains(text(),'Tham khảo ý kiến')]")).click();
        //Điền vào popup
        driver.findElement(By.xpath("//div[@class='block_input_data_post']//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']")).sendKeys(content);
        driver.findElement(By.xpath("(//input[@placeholder='Nhập câu hỏi'])[1]")).sendKeys(question1);
        driver.findElement(By.xpath("//div[@class='add_question']")).click();
        driver.findElement(By.xpath("(//input[@placeholder='Nhập câu hỏi'])[2]")).sendKeys(question2);
        //Click button
        driver.findElement(By.xpath("//div[@class='block_btn_post_news']")).click();
    }
}