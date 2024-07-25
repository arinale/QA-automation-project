package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WrongCoupon {

    final static String CARTVIEW = "cart-container";
    final static String ButtonCARTVIEW = "button wc-forward";
    final static String COUPONCODE = "coupon_code";
    final static String BUTTON = "//*[@id=\"post-39\"]/div/div/section[2]/div/div/div/div/div/div/div/form/table/tbody/tr[4]/td/div/button";


    public static void cartView(WebDriver driver) {
        driver.findElement(By.className(CARTVIEW)).click();
        // driver.findElement(By.className(ButtonCARTVIEW)).click();

    }

    public static void checkCoupon(WebDriver driver, String coupon) {

        // cartView(driver);
//        driver.findElement(By.id("menu-item-267")).click();
        WebElement searchField = driver.findElement(By.xpath("//*[@id=\"coupon_code\"]"));
        searchField.sendKeys(coupon);
        clickCoupon(driver);

    }

    public static void clickCoupon(WebDriver driver) {

        driver.findElement(By.xpath("//*[@id=\"post-39\"]/div/div/section[2]/div/div/div/div/div/div/div/form/table/tbody/tr[2]/td/div/button")).click();

//        driver.findElement(By.xpath("//*[@id=\"post-39\"]/div/div/section[2]/div/div/div/div/div/div/div/form/table/tbody/tr[4]/td/div/button")).click();

    }


}