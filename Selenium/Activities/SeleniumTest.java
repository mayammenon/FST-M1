package examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        //Webdriver object
        WebDriver driver = new FirefoxDriver();

        //Open a browser
        driver.get("https://training-support.net");

        //Close the browser
        driver.close();
    }
}
