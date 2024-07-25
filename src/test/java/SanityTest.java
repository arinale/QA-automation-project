import Pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;





public class SanityTest {
    WebDriver driver = new ChromeDriver();
    @BeforeClass
    public void setUp(){
        driver.get("https://atid.store/");
        driver.manage().window().maximize();
    }

    @Test
    public void test_call_men(){
        Men.callMen(driver);
        Assert.assertEquals(driver.getCurrentUrl(),"https://atid.store/product-category/men/");
    }
    @Test
    public void test_add_product_men(){
        test_call_men();
       String t =Men.Add_product(driver);
        Assert.assertTrue(t.contains("has been added to your cart."));
    }

    @Test
    public void test_search_product(){
        Search.search(driver,"black");
        Assert.assertTrue(driver.getPageSource().contains("Search results for"));
    }
@Test
public void Add_product_accessories(){
    String t = Accessories.Add_product_accessories(driver);
    Assert.assertTrue(t.contains("has been added to your cart."));
}

    @Test
    public void test_view_cart(){
         WrongCoupon.cartView(driver);
         Assert.assertTrue(true);
    }

    @Test
    public void test_wrong_coupon(){
       Men.Add_product(driver);
       WrongCoupon.cartView(driver);
       WrongCoupon.checkCoupon(driver,"aaaa");
       Assert.assertTrue(driver.findElement(By.className("woocommerce-notices-wrapper"))!=null);

    }

    @Test
    public void test_contactus(){

        String m= Contactus.fillContactUsForm(driver,"arin","hi","arin@gmail.com","product not found");
        Assert.assertTrue(m.contains("Thanks for contacting us"));
    }


    @AfterClass
    public void close(){
        driver.quit();
    }
}
