package pages;

import asserts.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DeleteEmployeePage {

    private WebDriver driver;

    public DeleteEmployeePage(WebDriver driver){

        this.driver = driver;
    }
    public DeleteEmployee deleteEmployee (){
        driver.findElement(By.id("delete-btn")).click();
        return new DeleteEmployee(driver);
    }
}
