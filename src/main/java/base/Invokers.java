package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Invokers {
    private static WebDriver driver;

    private Invokers(){
    }

    public  static WebDriver getInstance(){
        if (driver==null){
            return new Invokers().getDriver();
        }else {
            return driver;
        }
    }

    public  WebDriver getDriver()  {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://classic.crmpro.com/");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        return driver;
    }}
