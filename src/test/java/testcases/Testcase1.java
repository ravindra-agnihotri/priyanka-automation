package testcases;

import base.Invokers;
import methodFactory.CommonMethods;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Testcase1 {

    WebDriver driver= Invokers.getInstance();
    @Test
    public void login(){
LoginPage loginPage= new LoginPage(driver);
        loginPage.getUserName().sendKeys("rrvautomation");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("rrvautomation");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='mainpanel']")));
/*        CommonMethods.action();
        TakesScreenshot takesScreenshot= ((TakesScreenshot) driver);

        File e= takesScreenshot.getScreenshotAs(OutputType.FILE);
        File d= new File("/Users/ravindraagnihotri/Documents/priyanka.selenium/src/main/resources/xyz.jpeg");
        try {
        FileUtils.copyFile(e,d);}catch (IOException ex){
            ex.printStackTrace();
        List<WebElement> elements=driver.findElements(By.xpath("//div[@id='navMenu']//ul//li//a"));
        for (int i=0;i<=elements.size()-1;i++){
            if (elements.get(i).getText().equals("Knowledge Base")){
                elements.get(i).click();
            }*/
            CommonMethods.action().moveToElement(driver.findElement(By.xpath("//a[@title='Contacts']")))
                    .moveToElement(driver.findElement(By.xpath("//a[@title='New Contact']")))
                    .click().build().perform();
            driver.findElement(By.xpath("//img[@id='f_trigger_c_birthday']")).click();
            List<WebElement> cal= driver.findElements(By.xpath("//div[@class='calendar']//table//tbody//tr//td[@class='day']"));
            for (int i=0;i<= cal.size()-1;i++){
                if (cal.get(i).getText().equals("9")){
                    cal.get(i).click();
                    break;
                }
            }
        JavascriptExecutor javascriptExecutor= ((JavascriptExecutor) driver);
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//select[@id='timezone']")));

    }



        /*driver.navigate().to("https://the-internet.herokuapp.com/windows");
        String old= driver.getWindowHandle();
        //driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("/Users/ravindraagnihotri/Documents/priyanka.selenium/src/main/resources/xyz.jpeg");
        driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
        Set<String> wins=driver.getWindowHandles();
       for (String aa:wins) {
            if (!aa.equals(old)){
                driver.switchTo().window(aa);
            }
        }
        System.out.println(driver.findElement(By.tagName("h3")).getText());
    }*/

//    public Selenium a(){
//        return this;
//    }
//    public  void b(){}

    }
