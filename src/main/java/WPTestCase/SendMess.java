package WPTestCase;

import WPBase.LoginStaging;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class SendMess extends LoginStaging {

    @Test(priority = 1)
    public void Send() throws InterruptedException {
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/img[1]")).click();
        LogStag("acctest2@gmail.com", "123456");

        //Click vào cục chat & đợi loading ls chat
        WebElement Cucchat = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[2]/img[1]")));
        Cucchat.click();

        //Send text
        WebElement text = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.id("base-textarea-id")));
        text.sendKeys("Xin chào");
        Thread.sleep(5000);
        text.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        text.sendKeys("aa");
        text.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        text.sendKeys("Tôi muốn mua sữa rữa mặt");
        text.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        text.sendKeys("");
        text.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        String dodai = String.valueOf(text);
        if(dodai.length()!=0){
            System.out.print("Không gừi được ký tự trống");
        }
    }
//    @Test(priority = 2)
//    public void sendfile(String mulFile) throws InterruptedException{
//        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/img[1]")).click();
//        LogStag("acctest2@gmail.com", "123456");
//
//        //Click vào cục chat & đợi loading ls chat
//        WebElement Cucchat = new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[2]/img[1]")));
//        Cucchat.click();
//        Thread.sleep(6000);
//        //Send file
//        WebElement Iconfile = new WebDriverWait(driver, Duration.ofSeconds(5))
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@title='Tải file']//*[name()='svg']")));
//        Iconfile.click();
//        // Khởi tạo Robot class
//        Robot rb = null;
//        try {
//            rb = new Robot();
//        } catch (AWTException e) {
//            e.printStackTrace();
//        }
//        // Copy File path vào Clipboard
//        StringSelection str = new StringSelection("C:\\Users\\DELL\\Downloads\\ISTQB_CTFL_Syllabus-v4.0 (1) (2).pdf");
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//        Thread.sleep(1000);
//        // Nhấn Control+V để dán
//        rb.keyPress(KeyEvent.VK_CONTROL);
//        rb.keyPress(KeyEvent.VK_V);
//        // Xác nhận Control V trên
//        rb.keyRelease(KeyEvent.VK_CONTROL);
//        rb.keyRelease(KeyEvent.VK_V);
//        Thread.sleep(1000);
//        // Nhấn Enter
//        rb.keyPress(KeyEvent.VK_ENTER);
//        rb.keyRelease(KeyEvent.VK_ENTER);
//
//    }
    @Test(priority = 2)
    public void sendMultiplefile() throws InterruptedException{
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/img[1]")).click();
        LogStag("acctest2@gmail.com", "123456");

        //Click vào cục chat & đợi loading ls chat
        WebElement Cucchat = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[2]/img[1]")));
        Cucchat.click();
        Thread.sleep(6000);
        //Send file
        WebElement Iconfile = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@title='Tải file']//*[name()='svg']")));
        Iconfile.click();
        // Khởi tạo Robot class
        Robot rb1 = null;
        try {
            rb1 = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        // Copy File path vào Clipboard
        StringSelection str = new StringSelection("\"C:\\Users\\DELL\\Downloads\\20220123-DocumentsforITEXpress.docx\"" + "\"C:\\Users\\DELL\\Downloads\\RenewProjectdocs.xlsx\"");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        Thread.sleep(1000);
        // Nhấn Control+V để dán
        rb1.keyPress(KeyEvent.VK_CONTROL);
        rb1.keyPress(KeyEvent.VK_V);
        // Xác nhận Control V trên
        rb1.keyRelease(KeyEvent.VK_CONTROL);
        rb1.keyRelease(KeyEvent.VK_V);
        Thread.sleep(1000);
        // Nhấn Enter
        rb1.keyPress(KeyEvent.VK_ENTER);
        rb1.keyRelease(KeyEvent.VK_ENTER);
    }

    @Test(priority = 3)
    public void sendImg() throws InterruptedException{
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/img[1]")).click();
        LogStag("acctest2@gmail.com", "123456");

        //Click vào cục chat & đợi loading ls chat
        WebElement Cucchat = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[2]/img[1]")));
        Cucchat.click();
        Thread.sleep(6000);
        //Send file
        WebElement Iconfile = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@title='Tải file']//*[name()='svg']")));
        Iconfile.click();
        // Khởi tạo Robot class
        Robot rb1 = null;
        try {
            rb1 = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        // Copy File path vào Clipboard
        StringSelection str = new StringSelection("\"C:\\Users\\DELL\\Downloads\\1692717474739-891340049.jpg\"" + "\"C:\\Users\\DELL\\Downloads\\4531316318291094696.mp4\"");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        Thread.sleep(1000);
        // Nhấn Control+V để dán
        rb1.keyPress(KeyEvent.VK_CONTROL);
        rb1.keyPress(KeyEvent.VK_V);
        // Xác nhận Control V trên
        rb1.keyRelease(KeyEvent.VK_CONTROL);
        rb1.keyRelease(KeyEvent.VK_V);
        Thread.sleep(1000);
        // Nhấn Enter
        rb1.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        rb1.keyRelease(KeyEvent.VK_ENTER);
    }
}
