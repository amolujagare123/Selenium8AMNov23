package TestNG.demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SocialSites {

    WebDriver driver;
    @BeforeClass
    public void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void closeBrowser()
    {
        driver.close();
    }

    @Test
    public void visitFacebook() {
        driver.get("https://www.facebook.com/");
        // Add assertions or other test actions as needed
    }

    @Test
    public void exploreTwitter() {
        driver.get("https://twitter.com/");
        // Add assertions or other test actions as needed
    }

    @Test
    public void accessLinkedIn() {
        driver.get("https://www.linkedin.com/");
        // Add assertions or other test actions as needed
    }

    @Test
    public void openInstagram() {
        driver.get("https://www.instagram.com/");
        // Add assertions or other test actions as needed
    }

    @Test
    public void navigateYouTube() {
        driver.get("https://www.youtube.com/");
        // Add assertions or other test actions as needed
    }
}
