package tests;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.ContaPage;
import pages.HomePage;

public class TestContaExclusao extends BaseTest {

    HomePage homePage = new HomePage();
    ContaPage contaPage = new ContaPage();

    @Test
    public void testeExcluirConta(){
        homePage.listarConta();
        contaPage.clicarParaExcluirConta("Conta de Teste foi alterada");

        Assert.assertEquals("Conta removida com sucesso!", contaPage.pegarMensagemDeSucesso());

    }
}
