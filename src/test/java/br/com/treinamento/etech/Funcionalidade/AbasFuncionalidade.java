package br.com.treinamento.etech.Funcionalidade;

import br.com.treinamento.etech.Pages.AbasPage;
import br.com.treinamento.etech.commons.AppiumRobot;
import br.com.treinamento.etech.commons.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AbasFuncionalidade extends  BaseTest {

    private AbasPage abasPage;
    private AppiumRobot appiumRobot;

    public AbasFuncionalidade() {
        this.abasPage = new AbasPage(driver);
        this.appiumRobot = new AppiumRobot();
    }
    public void tocarAba2() {
        this.abasPage.getAba2().click();
    }
    public void validarMensagem(String texto){
        this.appiumRobot.validaExistenciaTexto(texto);
    }



}
