package teste;

import actions.AccessRegisterInmrobo;
import actions.AccessRegisterInmroboPage;
import pages.InserRegisterInformationPage;
import pages.InsertRegiserInformation;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;
import util.GeradorCPF;
import util.Parameters;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/***
 * Tests:
 * Register feature
 * Access feature
 * Create New employee feature
 * Edit employee feature
 * Delete employee feature
 */
public class RegisterInmroboTest{

    Random random = new Random();
    int number = random.nextInt(3);
    private static WebDriver driver;

    @BeforeClass
    public static void before(){
        System.setProperty("webdriver.chrome.driver", "/home/murilo/Documentos/webdrivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Parameters.url);

    }
    @Test
    public void sucessfullyClickOnRegister(){
        AccessRegisterInmroboPage registerInmrobo = new AccessRegisterInmroboPage(driver);
        AccessRegisterInmrobo page =
                registerInmrobo.register();
    }
    @Test
    public void createRegister() throws InterruptedException {
        InserRegisterInformationPage inserRegisterInformation = new InserRegisterInformationPage(driver);
        InsertRegiserInformation insertRegiserInformationPage =
                inserRegisterInformation
                        .insertData("testando82", "123456", "123456");
    }
    @Test
    public void accessAnmrboPortal(){
        AccessInmroboPortalPage accessInmroboPortal = new AccessInmroboPortalPage(driver);
        AccessInmroboPortal accessInmroboPotalPage =
                accessInmroboPortal.insertUserPassword("testando82", "123456");
    }
    @Test
    public void acreateBewEmployee() throws Exception {
        CreateNewEmployeePage createNewEmployeePage = new CreateNewEmployeePage(driver);
        CreateNewEmployee createNewEmployee =
                createNewEmployeePage.newEmployee("Frederico", "Analista QA", "461.961.390-88",
                        "7.300,00","16/09/2020");
    }
    @Test
    public void editSalary(){
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        EditEmployeePage editEmployeePage = new EditEmployeePage(driver);
        EditEmployee editEmployee =
                editEmployeePage.editEmployee("Desenvolvedor", "8.000,00");
    }
    @Test
    public void deleteEmployee(){
        DeleteEmployeePage deleteEmployeePage = new DeleteEmployeePage(driver);
        DeleteEmployee deleteEmployee =
                deleteEmployeePage.deleteEmployee();
    }
    @AfterClass
    public static void after(){
        //driver.quit();
    }

}
