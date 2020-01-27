package core;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.LoginPage;
import java.io.File;
import java.io.IOException;

import static core.BaseWebDriver.getDriver;
import static core.BaseWebDriver.killDriver;

public class BaseTest {
    private LoginPage loginPage = new LoginPage();

    @Rule
    public TestName testName = new TestName();

    @Before
    public void inicia(){
        loginPage.acessaPageInicial();
        loginPage.insereEmail("caio@teste");
        loginPage.insereSenha("teste123");
        loginPage.clicarBotaoEntrar();
    }


    @After
    public void finaliza() throws IOException {
        TakesScreenshot ss = (TakesScreenshot) getDriver();
        File arquivo = ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(arquivo, new File("target" + File.separator + "screenshot" +
                File.separator + testName.getMethodName() + System.nanoTime() + ".jpg"));

        if(BaseBrowser.FECHAR_BROWSER) {
            killDriver();
        }
    }

}
