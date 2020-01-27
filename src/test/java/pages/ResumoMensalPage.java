package pages;

import core.BasePage;
import org.openqa.selenium.By;

public class ResumoMensalPage extends BasePage {

    public void excluirMovimentacao(){
        clicarBotao(By.xpath("//span[@class='glyphicon glyphicon-remove-circle']"));
    }
    public String pegarMensagemDeSucesso(){
        return obterTexto(By.xpath("//div[@class='alert alert-success']"));
    }

}


