package OtherIMp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {
    @Test
    public void testFileUpload() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/amol.html");

        Thread.sleep(4000);

        WebElement fileUploadButton = driver.findElement(By.xpath("//input[@type='file']"));
        //fileUploadButton.sendKeys("D:\\Amol\\diwali-gif-sneh-2023\\Diwali.pdf");
        fileUploadButton.sendKeys("D:\\drm2-1.jpg");
    }

}
