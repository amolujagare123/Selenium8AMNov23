package AssertDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class LoginDemo {
    @Test
    public void loginTest1()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("admin1");

        WebElement btnUsername = driver.findElement(By.xpath("//input[@type='submit']"));
        btnUsername.click();

       /* String expected = "http://stock.scriptinglogic.org/dashboard.php";
        String actual = driver.getCurrentUrl();*/


     /*   String expected = "POSNIC - Dashboard";
        String actual = driver.getTitle();*/

        String expected = "Log out";
        String actual ="";
        try {
             actual = driver.findElement(By.cssSelector(".menu-logoff")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("expected:"+expected);
        System.out.println("actual:"+actual);

        Assert.assertEquals(actual,expected,"this is not a dashboard");
    }

    @Test
    public void loginTest2()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("admin");

        WebElement btnUsername = driver.findElement(By.xpath("//input[@type='submit']"));
        btnUsername.click();

        String expected = "Wrong Username or Password";
        String actual = "";
        try {
             actual = driver.findElement(By.cssSelector(".error-box")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("expected:"+expected);
        System.out.println("actual:"+actual);

        Assert.assertEquals(actual,expected,"incorrect or no error message");
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void loginTest3()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("");

        WebElement btnUsername = driver.findElement(By.xpath("//input[@type='submit']"));
        btnUsername.click();

        String expected1 = "PLEASE ENTER A USERNAME";
        String expected2 = "PLEASE PROVIDE A PASSWORD";

        ArrayList<String> expected = new ArrayList<>();

        expected.add(expected1);
        expected.add(expected2);

        // ["PLEASE ENTER A USERNAME","PLEASE PROVIDE A PASSWORD"]

        String actual1="";
        String actual2="";

        ArrayList<String> actual = new ArrayList<>();

        try{
            actual1 = driver.findElement(By.xpath("//label[@for='login-username' and @class='error']")).getText();
            actual2 = driver.findElement(By.xpath("//label[@for='login-password' and @class='error']")).getText();

            actual.add(actual1);
            actual.add(actual2);

            // ["PLEASE ENTER A USERNAME","PLEASE PROVIDE A PASSWORD"]
        }
        catch (Exception e)
        {

        }

        System.out.println("expected:"+expected);
        System.out.println("actual:"+actual);

        Assert.assertEquals(actual,expected,
                "wrong or no error message");

    }


    @Test
    public void loginTest4()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("");

        WebElement btnUsername = driver.findElement(By.xpath("//input[@type='submit']"));
        btnUsername.click();

        String expected1 = "PLEASE ENTER A USERNAME";
        String expected2 = "PLEASE PROVIDE A PASSWORD";

        ArrayList<String> expected = new ArrayList<>();

        expected.add(expected1);
        expected.add(expected2);

        // ["PLEASE ENTER A USERNAME","PLEASE PROVIDE A PASSWORD"]

        String actual1="";
        String actual2="";

        ArrayList<String> actual = new ArrayList<>();

        try{

            List<WebElement> errorListWB = driver.findElements(By.xpath("//label[@class='error']"));

            actual.add(errorListWB.get(0).getText());
            actual.add(errorListWB.get(1).getText());

        }
        catch (Exception e)
        {

        }

        System.out.println("expected:"+expected);
        System.out.println("actual:"+actual);

        Assert.assertEquals(actual,expected,
                "wrong or no error message");

    }

}
