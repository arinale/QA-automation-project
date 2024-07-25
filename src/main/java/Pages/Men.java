package Pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Men {

    public static void callMen(WebDriver driver){
        driver.findElement(By.xpath("//*[@id=\"menu-item-266\"]/a")).click();


    }

    public static String Add_product(WebDriver driver){
        callMen(driver);
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li[3]/div[1]/a/img")).click();
        driver.findElement(By.xpath("//*[@id=\"product-132\"]/div[2]/form/button")).click();
       String message= driver.findElement(By.className("woocommerce-message")).getText();
      return message;

    }






}
