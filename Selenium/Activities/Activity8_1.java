package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity8_1 {
    public static void main(String[]args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/tables");
        //Get columns
        List<WebElement> cols = driver.findElements(By.xpath("//table[@id='sortableTable']/thead/tr[1]/th"));
        //Get rows
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));

        //num of cols and rows
        System.out.println("Num of cols = " +cols.size());
        System.out.println("Num of rows = " + rows.size());
        //cell values of third row
    }
}
