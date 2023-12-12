package TestNG.demo3;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassThree {

    @Parameters({"myUser","myPass","myURL"})
    @Test
    public void classThreeTest1(String user,String password,String url)
    {
        System.out.println("url:"+url);
        System.out.println("user:"+user);
        System.out.println("password:"+password);

        System.out.println("classThreeTest1");
    }
    @Test(groups = "email")
    public void classThreeTest2()
    {
        System.out.println("classThreeTest2");
    }

    @Test
    public void classThreeTest3()
    {

        System.out.println("classThreeTest3");
    }



}
