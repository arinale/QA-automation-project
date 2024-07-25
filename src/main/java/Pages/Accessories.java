package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Accessories {

    final static String ACCESSORIES="menu-item-671";

    public static void callAccessories(WebDriver driver){
        driver.findElement(By.id(ACCESSORIES)).click();


    }

    public static String Add_product_accessories(WebDriver driver){
        callAccessories(driver);
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li[1]/div[1]/a/img")).click();
        driver.findElement(By.xpath("//*[@id=\"product-160\"]/div[2]/form/button")).click();
        String message= driver.findElement(By.className("woocommerce-message")).getText();
        return message;

    }
}







