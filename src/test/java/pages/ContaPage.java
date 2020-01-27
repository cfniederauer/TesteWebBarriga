package pages;

import core.BasePage;
import org.openqa.selenium.By;

public class ContaPage extends BasePage {

    public void inserirNome (String nome){
        escrever("nome", nome);
    }

    public void clicarSalvar(){
        clicarBotao(By.xpath("//button[.='Salvar']"));
    }

    public String pegarMensagemDeSucesso(){
        return obterTexto(By.xpath("//div[@class='alert alert-success']"));
    }

    public void clicarParaAlterarConta(String string) {
        obterCelula("Conta", string, "Ações", "tabelaContas")
                .findElement(By.xpath(".//span[@class='glyphicon glyphicon-edit']")).click();
    }

    public void clicarParaExcluirConta(String string) {
        obterCelula("Conta", string, "Ações", "tabelaContas")
                .findElement(By.xpath(".//span[@class='glyphicon glyphicon-remove-circle']")).click();
    }
}
