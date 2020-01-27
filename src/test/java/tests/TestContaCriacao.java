package tests;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.ContaPage;
import pages.HomePage;

public class TestContaCriacao extends BaseTest {

    HomePage homePage = new HomePage();
    ContaPage contaPage = new ContaPage();

    @Test
    public void testCriaConta(){
        homePage.inserirConta();
        contaPage.inserirNome("Conta de Teste");
        contaPage.clicarSalvar();

        Assert.assertEquals("Conta adicionada com sucesso!", contaPage.pegarMensagemDeSucesso());
    }
}
