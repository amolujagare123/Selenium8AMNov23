package MyListeners.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class InitExtentReport {

    public static  ExtentReports initExtentReports()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Report/report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("Stock management system");
        reporter.config().setReportName("regression report");


        extent.setSystemInfo("Project Name","Stock Management");
        extent.setSystemInfo("Developers Name","Ipsita");
        extent.setSystemInfo("Tester Name","Varun");
        extent.setSystemInfo("Dead line","15 feb 2024");
        extent.setSystemInfo("Build URL","http://localhost/stok");


        return extent;

    }
}
