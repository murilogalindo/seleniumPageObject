package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchEmployeePage {

    private WebDriver driver;

    public  SearchEmployeePage(WebDriver driver){

    }
    public SearchEmployee searchEmployee(){
        WebElement e = (new WebDriverWait(driver, 10))
        .until(ExpectedConditions.presenceOfElementLocated(By.xpath("delete-btn")));
        e.click();
        return new SearchEmployee(driver);
    }
}
