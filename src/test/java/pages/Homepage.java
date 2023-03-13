package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import runner.runTest;

import static runner.runTest.driver;

public class Homepage {

    WebDriver driver;
    public Homepage(WebDriver driver){
        this.driver = driver;
    }
    public void acessarAplicacao() {
        driver.get("https://blogdoagi.com.br/");
        Assert.assertEquals("Não acessou a aplicação!", true, driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/a[1]/img[1]")).isDisplayed());

    }

    public void clicarLupa() {
        driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/button[1]")).click();
    }

    public void clicarBotaoPesquisar() {
        driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[2]/form[1]/input[1]")).click();
    }


}
