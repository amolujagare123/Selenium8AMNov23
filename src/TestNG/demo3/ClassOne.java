package TestNG.demo3;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassOne {

    @Parameters({"myUser","myPass","myURL"})
    @Test
    public void classOneTest1(String user,String password,String url)
    {

        System.out.println("url:"+url);
        System.out.println("user:"+user);
        System.out.println("password:"+password);
        System.out.println("classOneTest1");
    }
    @Test (groups = "email")
    public void classOneTest2()
    {
        System.out.println("classOneTest2");
    }

    @Test
    public void classOneTest3()
    {
        System.out.println("classOneTest3");
    }
}
