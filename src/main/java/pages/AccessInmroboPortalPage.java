package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

/**
 * Page Object encapsulates the Access-page page.
 */
public class AccessInmroboPortalPage {

    private WebDriver driver;

    public AccessInmroboPortalPage(WebDriver driver){

        this.driver = driver;
    }
    /**
     * Login as valid user
     *
     * @param username
     * @param password
     * @return AccessPage object
     */
    public AccessInmroboPortal insertUserPassword(String username, String password){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div[6]/button")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]")).click();

        return new AccessInmroboPortal(driver);
    }

}
