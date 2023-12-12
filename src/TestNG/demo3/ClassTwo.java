package TestNG.demo3;

import TestNG.demo.BaseClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo extends BaseClass {

    @BeforeTest
    public void beforeMyTest()
    {
        System.out.println("beforeMyTest");
    }

    @AfterTest
    public void afterMyTest()
    {
        System.out.println("afterMyTest");
    }


    @Parameters({"myUser","myPass","myURL"})
    @Test
    public void classTwoTest1(String user,String password,String url)
    {

        System.out.println("url:"+url);
        System.out.println("user:"+user);
        System.out.println("password:"+password);
        System.out.println("classTwoTest1");
    }
    @Test(groups = "email")
    public void classTwoTest2()
    {
        System.out.println("classTwoTest2");
    }

    @Test
    public void classTwoTest3()
    {
        System.out.println("classTwoTest3");
    }
}
