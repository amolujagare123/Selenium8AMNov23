package MyListeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static MyListeners.util.InitExtentReport.initExtentReports;

public class MyExtentListener implements ITestListener
{
    ExtentReports extent;
    ExtentTest test;
     public void onTestStart(ITestResult result) {
        System.out.println("onTestStart");
         test  = extent.createTest(result.getMethod().getMethodName());
    }

    public  void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess");
        test.pass("Test is passed");
    }

    public  void onTestFailure(ITestResult result) {

        System.out.println("onTestFailure");
        test.info(result.getThrowable());
        test.fail("Test is failed");

    }

    public  void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped");
    }

    public  void onStart(ITestContext context) {
        System.out.println("onStart");

        if (extent==null)
          extent = initExtentReports();
    }

    public  void onFinish(ITestContext context) {
        System.out.println("onFinish");
        extent.flush();
    }
}
