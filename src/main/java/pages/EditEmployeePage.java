package pages;

import asserts.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditEmployeePage {

    private WebDriver driver;

    public EditEmployeePage(WebDriver driver){

        this.driver = driver;
    }
    public EditEmployee editEmployee (String office, String salary){
        driver.findElement(By.xpath("//*[@id=\"tabela\"]/tbody/tr[1]/td[6]/a[2]")).click();
        driver.findElement(By.id("inputCargo")).sendKeys(office);
        driver.findElement(By.id("dinheiro")).sendKeys(salary);
        String textoElement = driver.findElement(By.xpath("/html/body/div/div[1]/div/strong")).getText();
        Asserts.assertTrue("SUCESSO! Informações atualizadas com sucesso", textoElement);
        System.out.println(textoElement);
        return new EditEmployee(driver);
    }
}
