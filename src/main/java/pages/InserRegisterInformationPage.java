package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

/**
 * Page Object encapsulates the Register page.
 */
public class InserRegisterInformationPage {

    private WebDriver driver;

    public InserRegisterInformationPage(WebDriver driver){

        this.driver = driver;
    }
    /**
     * Login as valid user
     *
     * @param username
     * @param password
     * @param confirmpassword
     * @return RegisterPage object
     */
    public InsertRegiserInformation insertData(String username, String password, String confirmpassword) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.name("confirmpass")).sendKeys(confirmpassword);
        driver.findElement(By.className("login100-form-btn")).click();

        return new InsertRegiserInformation(driver);
    }

}
