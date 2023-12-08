import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo1 {

    static WebDriver driver;

    @BeforeClass  // execute before the first Test Method
    public static void openBrowser(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass // execute after the last Test Method
    public static void closeBrowser(){
        driver.close();
    }

    @Test
    public void loginTest1(){

        driver.get("https://stock.scriptinglogic.org/index.php");

        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");

        driver.findElement(By.name("submit")).click();

    }

    @Test
    public void loginTest2(){

        driver.get("https://stock.scriptinglogic.org/index.php");

        driver.findElement(By.name("username")).sendKeys("sdfff");
        driver.findElement(By.name("password")).sendKeys("ffh");

        driver.findElement(By.name("submit")).click();

    }

    @Test
    public void loginTest3(){

        driver.get("https://stock.scriptinglogic.org/index.php");

        driver.findElement(By.name("username")).sendKeys("");
        driver.findElement(By.name("password")).sendKeys("");

        driver.findElement(By.name("submit")).click();

    }
}
