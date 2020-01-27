package tests;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.ContaPage;
import pages.HomePage;

public class TestContaAlteracao extends BaseTest {

    HomePage homePage = new HomePage();
    ContaPage contaPage = new ContaPage();

    @Test
    public void testeAlterarConta(){
        homePage.listarConta();
        contaPage.clicarParaAlterarConta("Conta de Teste");
        contaPage.inserirNome("Conta de Teste foi alterada");
        contaPage.clicarSalvar();

        Assert.assertEquals("Conta alterada com sucesso!", contaPage.pegarMensagemDeSucesso());

    }

}
