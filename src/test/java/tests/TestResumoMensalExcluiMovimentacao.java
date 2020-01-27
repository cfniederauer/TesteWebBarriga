package tests;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.ResumoMensalPage;

public class TestResumoMensalExcluiMovimentacao extends BaseTest {

    private HomePage homePage = new HomePage();
    private ResumoMensalPage resumoMensalPage = new ResumoMensalPage();
    @Test
    public void excluirMovimentacao(){
        homePage.visualizarResumoMensal();
        resumoMensalPage.excluirMovimentacao();
        Assert.assertEquals("Movimentação removida com sucesso!", resumoMensalPage.pegarMensagemDeSucesso());


    }
}
