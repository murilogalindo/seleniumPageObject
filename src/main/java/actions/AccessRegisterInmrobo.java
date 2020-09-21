package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccessRegisterInmrobo {

    private WebDriver driver;

    public AccessRegisterInmrobo(WebDriver driver){

        this.driver = driver;
    }
    public boolean isValida() {

        return temBarraNavegacao() && temListagemProjetos();
    }

    private boolean temBarraNavegacao() {

        return driver.findElement(By.className("navbar")) != null;
    }

    private boolean temListagemProjetos() {
        return driver.findElement(By.tagName("h2")).getText().contains("Projetos");
    }

}
