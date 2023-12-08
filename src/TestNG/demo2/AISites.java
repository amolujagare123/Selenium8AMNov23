package TestNG.demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AISites {
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
    public void chatGpt()
    {
        driver.get("https://chat.openai.com/");
    }

  /*  @Test
    public void navigateToDeepMind() {
        driver.get("https://deepmind.com/");
        // Add assertions or other test actions as needed
    }*/

    @Test
    public void exploreIBMWatson() {
        driver.get("https://www.ibm.com/watson");
        // Add assertions or other test actions as needed
    }

    @Test
    public void visitOpenAIResearch() {
        driver.get("https://openai.com/research/");
        // Add assertions or other test actions as needed
    }

    @Test
    public void accessTensorFlow() {
        driver.get("https://www.tensorflow.org/");
        // Add assertions or other test actions as needed
    }

}
