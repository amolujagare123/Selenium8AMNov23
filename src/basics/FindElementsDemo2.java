package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class FindElementsDemo2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        List<WebElement> wbList = driver.findElements(By.tagName("a"));
        System.out.println("size="+wbList.size());

        for(int i=0;i<wbList.size();i++)
        {
            System.out.println(wbList.get(i).getText());
        }

    }
}
