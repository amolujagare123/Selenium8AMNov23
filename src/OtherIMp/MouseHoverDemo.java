package OtherIMp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverDemo {

    @Test
    public void testMouseHover() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stqatools.com/demo/MouseHover.php");


        WebElement mouseHoverDropDown
                = driver.findElement(By.xpath("//button[@class='dropbtn']"));
        Thread.sleep(4000);

        Actions actions = new Actions(driver);

        actions.moveToElement(mouseHoverDropDown).build().perform();

        driver.findElement(By.xpath("//a[text()='Link 2']")).click();



    }

}
