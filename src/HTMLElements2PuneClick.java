import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HTMLElements2PuneClick {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.click.in/pune/classifieds/60/post.html");

        // 1. find the element
        WebElement jobLocation = driver.findElement(By.id("source_118"));

        // 2. create an object ofSelect class
        Select selJobLocation = new Select(jobLocation);


        Thread.sleep(4000);
        // 3. select the option
        selJobLocation.selectByVisibleText("Bangalore");
        selJobLocation.selectByIndex(2);
        selJobLocation.selectByIndex(3);

        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[1]")).click();


        // 1. find the element
        WebElement location = driver.findElement(By.id("fld_118"));
        // 2. create an object ofSelect class
        Select selLocation = new Select(location);
        selLocation.selectByIndex(1);
        selLocation.selectByIndex(2);

        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[2]")).click();
    }
    }
