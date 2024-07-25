package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Search {
    final static String SEARCH="wc-block-search__input-1";
    final static String BUTTONCLASSNAME ="wc-block-product-search__button";


    public static void callStore(WebDriver driver){
        driver.findElement(By.id("menu-item-45")).click();

    }
    public static void search(WebDriver driver,String searchproductname ){
        callStore(driver);
        WebElement searchField = driver.findElement(By.id(SEARCH));
        searchField.sendKeys(searchproductname);
        driver.findElement(By.className(BUTTONCLASSNAME)).click();

    }

}
