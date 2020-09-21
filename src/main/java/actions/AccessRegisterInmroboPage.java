package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class AccessRegisterInmroboPage {

    private WebDriver driver;

    public AccessRegisterInmroboPage(WebDriver driver) {

        this.driver = driver;
    }

    public AccessRegisterInmrobo register(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div[7]/a")).click();
        return new AccessRegisterInmrobo(driver);
    }


}
