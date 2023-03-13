package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.Homepage;
import runner.runTest;

public class Buscar extends runTest {

    Homepage homepage = new Homepage(driver);


    @Dado("^que estou no site Blog da agi")
    public void acessar_site_blogdoagi() {
        homepage.acessarAplicacao();
    }

    @Quando("^clico na lupa no canto superior direito")
    public void clico_na_lupa_no_canto_superior_direito() {
        homepage.clicarLupa();
    }

    @Quando("^escrevo uma palavra-chave válida$")
    public void escrevo_uma_palavra_chave_válida() {
        driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[2]/form[1]/label[1]/input[1]")).sendKeys("atuação");
        driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[2]/form[1]/input[1]")).click();
    }

    @Então("^aparece os artigos relacionados$")
    public void aparece_os_artigos_relacionados() {
        String resultado_busca = driver.findElement(By.xpath("//h1[contains(.,'Resultados da busca por: atuação')]")).getText();
        Assert.assertEquals("o Texto foi encontrado", "Resultados da busca por: atuação", resultado_busca);

    }


    @Dado("^que eu escrevo uma palavra-chave inválida")
    public void escrevo_uma_palavra_chave_inválida() {
        homepage.clicarLupa();
        driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[2]/form[1]/label[1]/input[1]")).sendKeys("selenium");
        homepage.clicarBotaoPesquisar();
    }

        @Então("^aparece a mensagem de Texto nenhum resultado")
        public void busca_indefinida() {
            String resultado_busca = driver.findElement(By.xpath("//h1[@class='entry-title'][contains(.,'Nenhum resultado')]")).getText();
            Assert.assertEquals("Nenhum resultado encontrado", "Nenhum resultado", resultado_busca);



    }

}