package tests;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.MovimentacaoPage;

public class TestMovimentacaoCriacao extends BaseTest {

    private HomePage homePage = new HomePage();
    private MovimentacaoPage movimentacaoPage = new MovimentacaoPage();

    @Test
    public void criarMovimentacao(){
        homePage.inserirMovimentacao();
        movimentacaoPage.inserirDataMovimentacao("25/01/2020");
        movimentacaoPage.inserirDataPagamento("27/01/2020");
        movimentacaoPage.inserirDescricao("Teste Movimentacao");
        movimentacaoPage.inserirInteressado("Teste Interessado");
        movimentacaoPage.inserirValor("50");
        movimentacaoPage.inserirConta("Conta de Teste foi alterada");
        movimentacaoPage.inserirStatusPago();
        movimentacaoPage.clicarSalvar();

        Assert.assertEquals("Movimentação adicionada com sucesso!", movimentacaoPage.pegarMensagemDeSucesso());

    }
}
