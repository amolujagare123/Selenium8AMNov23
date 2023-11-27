package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HTMLElements {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/amol.html");

        // 1. find the element
        WebElement selText = driver.findElement(By.id("seltext"));

        // 2. create an object ofSelect class
        Select selTxt = new Select(selText);


        Thread.sleep(4000);
        // 3. select the option
       /* selTxt.selectByVisibleText("text 2");
        selTxt.selectByIndex(3);*/
        selTxt.selectByValue("val1");

    }
    }
