package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("admin");

       // WebElement btnUsername = driver.findElement(By.name("submit"));
        WebElement btnUsername = driver.findElement(By.xpath("//input[@type='submit']"));
        btnUsername.click();

       // driver.findElement(By.xpath("//a[@href='add_customer.php']")).click();
        driver.findElement(By.xpath("//a[text()='Add Customer']")).click();

        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Ishan");
        driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("xyz");
        driver.findElement(By.xpath("//input[@name='contact1']")).sendKeys("324434");
        driver.findElement(By.xpath("//input[@name='contact2']")).sendKeys("6565656");
        driver.findElement(By.xpath("//input[@name='Submit']")).click();

    }
}
