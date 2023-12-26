package DataProvider;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AddCustomer {
    WebDriver driver;
    @BeforeClass
    public void doLogin()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        // WebElement btnUsername = driver.findElement(By.name("submit"));
        WebElement btnUsername = driver.findElement(By.className("blue"));
        btnUsername.click();
    }

    @Test(dataProvider = "getData")
    public void addCustomerTest(String name,String address,String contact1,String contact2)
    {
        driver.findElement(By.partialLinkText("Add Cus")).click();

        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("address")).sendKeys(address);
        driver.findElement(By.name("contact1")).sendKeys(contact1);
        driver.findElement(By.name("contact2")).sendKeys(contact2);
        driver.findElement(By.name("Submit")).click();
    }

    @DataProvider
    public Object[][] getData() throws IOException {
        FileInputStream fis = new FileInputStream("Data/Data3.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("AddCustomer");
        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rowCount-1][colCount];

        for (int i=0;i<rowCount-1;i++)
        {
            XSSFRow row = sheet.getRow(i+1);

            XSSFCell name = row.getCell(0);

            if(name==null)
                data[i][0] = "";
            else {
                name.setCellType(CellType.STRING);
                data[i][0] = name.toString().trim();
            }

            XSSFCell address = row.getCell(1);

            if(address==null)
                data[i][1] = "";
            else {
                address.setCellType(CellType.STRING);
                data[i][1] = address.toString().trim();
            }


            XSSFCell contact1 = row.getCell(2);

            if(contact1==null)
                data[i][2] = "";
            else {
                contact1.setCellType(CellType.STRING);
                data[i][2] = contact1.toString().trim();
            }

            XSSFCell contact2 = row.getCell(3);

            if(contact2==null)
                data[i][3] = "";
            else {
                contact2.setCellType(CellType.STRING);
                data[i][3] = contact2.toString().trim();
            }


        }

        return data;

    }
}
