package OtherIMp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertBoxes {

    @Test
    public void testAlert() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/amol.html");


       // driver.findElement(By.name("submit")).click();
        driver.findElement(By.xpath("//button[text()='Try it']")).click();

        Thread.sleep(4000);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText()); // get the text from the alert
        alert.accept(); // ok
        //alert.dismiss(); // cancel


    }

}
