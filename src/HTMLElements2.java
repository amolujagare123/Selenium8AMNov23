import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HTMLElements2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/amol.html");

        // 1. find the element
        WebElement multiList = driver.findElement(By.id("multiSel"));

        // 2. create an object ofSelect class
        Select selTxt = new Select(multiList);


        Thread.sleep(4000);
        // 3. select the option
        selTxt.selectByVisibleText("text 2");
        selTxt.selectByIndex(3);
        selTxt.selectByIndex(0);

        Thread.sleep(4000);

      /*  selTxt.deselectByVisibleText("text 2");
        selTxt.deselectByIndex(3);
        selTxt.deselectByIndex(0);*/

        selTxt.deselectAll();
    }
    }
