package Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo2 {

    WebDriver driver;
    @Before // method below this annotation will run before every test method of this class
    public void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After// method below this annotation will run after every last test method of this class
    public void closeBrowser()
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
        btnUsername.click();
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
        btnUsername.click();
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
        btnUsername.click();
    }

}
