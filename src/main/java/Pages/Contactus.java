package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Contactus {
    final public static String CONTACT_NAV_LINK ="menu-item-829";
    final public static String NAME ="wpforms-15-field_0";
    final public static String SUBJECT ="wpforms-15-field_5";
    final public static String EMAIL ="wpforms-15-field_4";
    final public static String MESSAGE ="wpforms-15-field_2";
    final public static String SEND_MESSAGE_BUTTON ="wpforms-submit-15";
    final public static String success_message ="wpforms-confirmation-1";
    //*[@id="wpforms-confirmation-15"]/p"





    public static void callContactUs(WebDriver driver){
        driver.findElement(By.id(CONTACT_NAV_LINK)).click();
    }

    public static String fillContactUsForm(WebDriver driver, String name, String subject, String email, String massage)
    {
        callContactUs(driver);
        driver.findElement(By.id(CONTACT_NAV_LINK)).click();
        WebElement nameField=driver.findElement(By.id(NAME));
        nameField.sendKeys(name);
        WebElement subjectField=driver.findElement(By.id(SUBJECT));
        subjectField.sendKeys(subject);
        WebElement emailField=driver.findElement(By.id(EMAIL));
        emailField.sendKeys(email);
        WebElement massageField=driver.findElement(By.id(MESSAGE));
        massageField.sendKeys(massage);
        WebElement sendButton = driver.findElement(By.id(SEND_MESSAGE_BUTTON));
        sendButton.click();
        WebElement message = driver.findElement(By.cssSelector("#wpforms-confirmation-15 > p"));
        String mess=message.getText();
        return mess;


    }
}