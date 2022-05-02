package activities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.PublicKey;

import static org.testng.AssertJUnit.assertEquals;

public class FirstExampleTest {
    //Declare AndroidDriver
    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        //set desired capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceId","46fd4805" );
        caps.setCapability("platformName", "android");
        caps.setCapability("automatioName","UiAutomator2");
        caps.setCapability("appPackage","net.oneplus.launcher");
        caps.setCapability("appActivity",".Launcher");
        caps.setCapability("noReset",true);

        //set appium server url
        URL remoteURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<>(remoteURL,caps);

    }

    @Test
    public void additionTest(){
        //Find the button 5
        MobileElement digit5 = driver.findElementById("com.oneplus.calculator:id/digit_5");
        //CLick 5
        digit5.click();
        //Find & CLick +
        driver.findElementByAndroidUIAutomator("com.oneplus.calculator:id/op_add").click();
        //Click 5 again
        digit5.click();
        driver.findElementByAccessibilityId("com.oneplus.calculator:id/eq").click();
        //Find result print it
        String resultText = driver.findElementById("result").getText();
        System.out.println(resultText);

        //Assertion
        assertEquals(resultText, "10");
    }

    @AfterClass
    public void tearDown(){
        //CLose
        driver.quit();
    }
}
