package pages;

import asserts.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateNewEmployeePage {

    private WebDriver driver;

    public CreateNewEmployeePage(WebDriver driver){

        this.driver = driver;
    }
    public CreateNewEmployee newEmployee (String name, String office, String cpf, String salary, String admission){

       driver.findElement(By.id("inputNome")).sendKeys(name);
        driver.findElement(By.id("inputCargo")).sendKeys(office);
        driver.findElement(By.id("cpf")).sendKeys(cpf);
        driver.findElement(By.id("dinheiro")).sendKeys(salary);
        Select selectgender = new Select(driver.findElement(By.id("slctSexo")));
        selectgender.selectByIndex(3);
        driver.findElement(By.id("clt")).click();
        driver.findElement(By.id("inputAdmissao")).sendKeys(admission);
        driver.findElement(By.className("cadastrar-form-btn")).click();

        String textoElement = driver.findElement(By.xpath("/html/body/div/div[1]/div/strong")).getText();
        Asserts.assertTrue("SUCESSO! Usuário cadastrado com sucesso", textoElement);
        System.out.println(textoElement);

        return new CreateNewEmployee(driver);
    }

}
