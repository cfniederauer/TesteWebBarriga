package pages;

import core.BaseWebDriver;
import core.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    public void acessaPageInicial() {
        BaseWebDriver.getDriver().get("https://seubarriga.wcaquino.me/");
    }
    public void insereEmail(String email) {
        escrever("email", email);
    }
    public void insereSenha(String senha) {
        escrever("senha", senha);
    }
    public void clicarBotaoEntrar() {
        clicarBotao(By.xpath("//button[.='Entrar']"));
    }
}

