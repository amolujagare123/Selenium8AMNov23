package OtherIMp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PromptBoxes {

    @Test
    public void testAlert() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");




        driver.switchTo().frame("iframeResult");

        driver.findElement(By.xpath("//button[text()='Try it']")).click();


       Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText()); // get the text from the alert
        alert.sendKeys("Amol Ujagare");
        alert.accept(); // ok
        //alert.dismiss(); // cancel


    }

}
