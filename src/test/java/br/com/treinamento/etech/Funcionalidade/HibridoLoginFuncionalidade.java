package br.com.treinamento.etech.Funcionalidade;

import br.com.treinamento.etech.Pages.HibridoLoginPage;
import br.com.treinamento.etech.commons.AppiumRobot;
import br.com.treinamento.etech.commons.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HibridoLoginFuncionalidade extends BaseTest {

    private HibridoLoginPage hibridoLoginPage;
    private AppiumRobot appiumRobot;

    public HibridoLoginFuncionalidade() {
        this.hibridoLoginPage = new HibridoLoginPage(driver);
        this.appiumRobot = new AppiumRobot();
    }

    public void preecherEmail(String email) {
        this.hibridoLoginPage.getEmail().sendKeys(email);
    }

    public void preecherSenha(String senha) {
        this.hibridoLoginPage.getSenha().sendKeys(senha);
    }

    public void selicionoAOpcao() {
        driverWait.until(ExpectedConditions.visibilityOf(this.hibridoLoginPage.getLogin()));
        this.hibridoLoginPage.getLogin().click();
    }
    public void visualizoAMensagem(String texto) {
        this.appiumRobot.validaMensagem(texto);
    }
}