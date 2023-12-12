package TestNG.demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JobSites extends BaseClass{



    @Test
    public void visitNaukri() {
        driver.get("https://www.naukri.com/");
        // Add assertions or other test actions as needed
    }

    @Test
    public void exploreIndeedIndia() {
        driver.get("https://www.indeed.co.in/");
        // Add assertions or other test actions as needed
    }

    @Test (enabled = false)
    public void accessMonsterIndia() {
        driver.get("https://www.monsterindia.com/");
        // Add assertions or other test actions as needed
    }

    @Test
    public void openShine() {
        driver.get("https://www.shine.com/");
        // Add assertions or other test actions as needed
    }

    @Test
    public void navigateTimesJobs() {
        driver.get("https://www.timesjobs.com/");
        // Add assertions or other test actions as needed
    }

}
