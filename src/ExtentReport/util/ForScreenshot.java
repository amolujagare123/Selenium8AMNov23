package ExtentReport.util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ForScreenshot {

    public static String takeTheScreenshot(WebDriver driver) throws IOException {
        // 1. create the object reference of TakesScreenshot
        // assign the current driver to it.

        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2 .  call the method getScreenshotAs() using
        // the object reference of TakesScreenshot
        // store this in to a file object

        File scrFile = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_yyyyddMM_hhmmss").format(new Date());
        String fileName = "IMG"+timeStamp+".png";
        // 3. copy the file object in to the real image file
        FileUtils.copyFile(scrFile,new File("Report\\screenshots\\"+fileName));

        return fileName;

    }
}
