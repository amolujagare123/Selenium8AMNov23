package OtherIMp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDropDemo {

    @Test
    public void testDragAndDrop() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

        WebElement dragMeToMyTarget = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement dropHere = driver.findElement(By.xpath("//div[@id='droppable']"));

        String expectedColor = "#fffa90";

        Thread.sleep(4000);

        Actions action = new Actions(driver);

        action.dragAndDrop(dragMeToMyTarget,dropHere).build().perform();

        String actualColorRgb = dropHere.getCssValue("background");

        System.out.println("expectedColor="+expectedColor);

        String actualColor =  convertRgbToHex(actualColorRgb);
        System.out.println("actualColor="+actualColor);

    //    Assert.assertEquals(convertRgbToHex(actualColor),expectedColor,"wrong color");

    }


    String  convertRgbToHex(String rgbColor)
    {
       return Color.fromString(rgbColor).asHex();
    }
}
