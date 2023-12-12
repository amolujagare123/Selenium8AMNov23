package TestNG.demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SocialSites extends BaseClass{


    @Test (priority = 4)
    public void visitFacebook() {
        driver.get("https://www.facebook.com/");
        // Add assertions or other test actions as needed
    }
    @Test (priority = 1)
    public void exploreTwitter() {
        driver.get("https://twitter.com/");
        // Add assertions or other test actions as needed
    }
    @Test  (priority = 4)
    public void accessLinkedIn() {
        driver.get("https://www.linkedin.com/");
        // Add assertions or other test actions as needed
    }
    @Test (priority = 2)
    public void openInstagram() {
        driver.get("https://www.instagram.com/");
        // Add assertions or other test actions as needed
    }
    @Test  (priority = 3)
    public void navigateYouTube() {
        driver.get("https://www.youtube.com/");
        // Add assertions or other test actions as needed
    }
}
