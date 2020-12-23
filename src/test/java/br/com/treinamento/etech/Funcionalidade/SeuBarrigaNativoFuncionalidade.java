package br.com.treinamento.etech.Funcionalidade;

import br.com.treinamento.etech.Pages.SeuBarrigaNativoPage;
import br.com.treinamento.etech.commons.AppiumRobot;
import br.com.treinamento.etech.commons.BaseTest;
import br.com.treinamento.etech.steps.SeuBarrigaNativoSteps;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeuBarrigaNativoFuncionalidade extends BaseTest {


    private SeuBarrigaNativoPage seuBarrigaNativoPage;
    private AppiumRobot appiumRobot;

    public SeuBarrigaNativoFuncionalidade(){
        this.seuBarrigaNativoPage = new SeuBarrigaNativoPage(driver);
        this.appiumRobot = new AppiumRobot();

    }
    public void preencherCampoNome(){
        driverWait.until(ExpectedConditions.visibilityOf(this.seuBarrigaNativoPage.getlogin()));
        this.seuBarrigaNativoPage.getlogin().sendKeys("Marisa de Mello");

    }
    public void preencherCampoSenha(){
        this.seuBarrigaNativoPage.getsenha().sendKeys("123456");
    }
    public boolean validarMensagemDeErro() { return this.appiumRobot.validaExistenciaTexto("Problemas com o login"); }

}
