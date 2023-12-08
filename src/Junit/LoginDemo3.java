package Junit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo3 {

    static WebDriver driver;
    @BeforeClass // method below this annotation will run before first test method of this class
    public static void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass// method below this annotation will run after last test method of this class
    public static void closeBrowser()
    {
        driver.close();
    }
    @Test
    public void loginTest1()
    {

        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("admin");

        WebElement btnUsername = driver.findElement(By.xpath("//input[@type='submit']"));
     //   btnUsername.click();
    }

    @Test
    public void loginTest2()
    {

        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        txtUsername.sendKeys("fdfdf");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("2ewerer");

        WebElement btnUsername = driver.findElement(By.xpath("//input[@type='submit']"));
   //     btnUsername.click();
    }

    @Test
    public void loginTest3()
    {

        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("");

        WebElement btnUsername = driver.findElement(By.xpath("//input[@type='submit']"));
  //      btnUsername.click();
    }

}
