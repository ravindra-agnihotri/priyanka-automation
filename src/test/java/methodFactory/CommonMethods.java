package methodFactory;

import base.Invokers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class CommonMethods {
    static WebDriver driver= Invokers.getInstance();

    public static Actions action(){
        return new Actions(driver);
        /*actions.moveToElement(driver.findElement(By.xpath("//a[@title='Companies']")))
                .moveToElement(driver.findElement(By.xpath("//a[@title='New Company']"))).click().build().perform();
        Select select= new Select(driver.findElement(By.xpath("//select[@name='status']")));
        select.selectByValue("Active");*/
    }
}
