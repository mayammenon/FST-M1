package examples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example1 {

    @BeforeMethod
    public void setUp(){
        System.out.println("Runs Before every test method");
    }

    @Test
    public void testMethod1(){
        System.out.println("This is method1");
    }

    @Test
    public void testMethod2(){
        System.out.println("This is method2");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("Runs after every test method");
    }
}


