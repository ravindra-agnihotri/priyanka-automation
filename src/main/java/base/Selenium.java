package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Selenium {
    @Test
    public void automation() throws IOException {
    WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://classic.crmpro.com/");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rrvautomation");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("rrvautomation");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='mainpanel']")));
        Actions actions= new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//a[@title='Companies']")))
                .moveToElement(driver.findElement(By.xpath("//a[@title='New Company']"))).click().build().perform();
        Select select= new Select(driver.findElement(By.xpath("//select[@name='status']")));
        select.selectByValue("Active");
        TakesScreenshot takesScreenshot= ((TakesScreenshot) driver);

        File e= takesScreenshot.getScreenshotAs(OutputType.FILE);
        File d= new File("/Users/ravindraagnihotri/Documents/priyanka.selenium/src/main/resources/xyz.jpeg");
        FileUtils.copyFile(e,d);
    }

//    public Selenium a(){
//        return this;
//    }
//    public  void b(){}

}
