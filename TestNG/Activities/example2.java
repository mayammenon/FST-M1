package examples;

import org.testng.annotations.*;

public class example2 {
    @BeforeClass
    public void setUp(){
        System.out.println("Runs Before every test class");
    }

    @Test
    public void testMethod1(){
        System.out.println("This is method1");
    }

    @Test
    public void testMethod2(){
        System.out.println("This is method2");
    }

    @AfterClass
    public void tearDown(){
        System.out.println("Runs after every test class");
    }

}
