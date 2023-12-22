package ScreenshotDemo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyScreenshotDemo {

    @Test
    public void loginTest1() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com/");

        // 1. create the object reference of TakesScreenshot
        // assign the current driver to it.

       /* MyScreenshotDemo ob = new MyScreenshotDemo();
        MyScreenshotDemo ob2;
        ob2 = ob;*/
        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2 .  call the method getScreenshotAs() using
        // the object reference of TakesScreenshot
        // store this in to a file object

        File scrFile = ts.getScreenshotAs(OutputType.FILE);

   /*     double randomNumber = Math.random();
        String fileName = "IMG"+randomNumber+".png";*/

        String timeStamp = new SimpleDateFormat("_yyyyddMM_hhmmss").format(new Date());
        String fileName = "IMG"+timeStamp+".png";
        // 3. copy the file object in to the real image file
        FileUtils.copyFile(scrFile,new File("D:\\screenshots\\"+fileName));
    }

}
