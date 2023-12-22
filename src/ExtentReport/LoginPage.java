package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static ExtentReport.util.ForScreenshot.takeTheScreenshot;

public class LoginPage {


    ExtentReports extent ;
    @BeforeClass
    public void initExtent()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Report/report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("Stock management system");
        reporter.config().setReportName("regression report");


        extent.setSystemInfo("Project Name","Stock Management");
        extent.setSystemInfo("Developers Name","Ipsita");
        extent.setSystemInfo("Tester Name","Varun");
        extent.setSystemInfo("Dead line","15 feb 2024");
        extent.setSystemInfo("Build URL","http://localhost/stok");

    }

    @AfterClass
    public void writeToReport()
    {
        extent.flush(); // write to report
    }


    @Test
    public void loginTest1() throws IOException {
        ExtentTest test = extent.createTest("Valid input test");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        test.info("URL is opened");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        txtUsername.sendKeys("admin");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("admin");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();

        test.info("login button is clicked");

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

        try {
            Assert.assertEquals(actual, expected, "this is not a dashboard");
            test.pass("this test is passed");
        }
        catch (AssertionError e){
            test.addScreenCaptureFromPath("./screenshots/"+takeTheScreenshot(driver));
        test.fail(e.getMessage());
        }
    }

    @Test
    public void loginTest2() throws IOException {
        ExtentTest test = extent.createTest("invalid input test");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        test.info("URL is opened");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        txtUsername.sendKeys("fdfd");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("dfdf");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();

        test.info("login button is clicked");

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

        try {
            Assert.assertEquals(actual, expected, "incorrect or no error message");
            test.pass("this test is passed");
        }
        catch (AssertionError e){
            test.addScreenCaptureFromPath("./screenshots/"+takeTheScreenshot(driver));
            test.fail(e.getMessage());
        }


    }

    @Test
    public void loginTest3() throws IOException {
        ExtentTest test = extent.createTest("blank input test");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        test.info("URL is opened");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        txtUsername.sendKeys("");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();

        test.info("login button is clicked");

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

        try {
            Assert.assertEquals(actual, expected, "incorrect or no error message");
            test.pass("this test is passed");
        }
        catch (AssertionError e){
            test.addScreenCaptureFromPath("./screenshots/"+takeTheScreenshot(driver));
            test.fail(e.getMessage());
        }


    }

}
