package OtherIMp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class multipleTab {

    @Test
    public void testAlert() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://gmail.com");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://facebook.com");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://google.com");

        List<String> tab = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(tab.get(1));

        System.out.println(driver.getTitle());



    }

}
