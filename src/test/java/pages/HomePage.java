package pages;

import core.BasePage;

public class HomePage extends BasePage {

    public void listarConta(){
        clicarLink("Contas");
        clicarLink("Listar");
    }
    public  void inserirConta(){
        clicarLink("Contas");
        clicarLink("Adicionar");
    }
    public void inserirMovimentacao(){
        clicarLink("Criar Movimentação");

    }
    public void visualizarResumoMensal(){
        clicarLink("Resumo Mensal");
    }
}
