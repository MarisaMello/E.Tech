package br.com.treinamento.etech.Funcionalidade;

import br.com.treinamento.etech.Pages.SeuBarrigaHibridoPage;
import br.com.treinamento.etech.commons.AppiumRobot;
import br.com.treinamento.etech.commons.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeuBarrigaHibridoFuncionalidade extends BaseTest {

    private SeuBarrigaHibridoPage seuBarrigaHibidroPage;
    private AppiumRobot appiumRobot;

    public SeuBarrigaHibridoFuncionalidade(){
        this.seuBarrigaHibidroPage = new SeuBarrigaHibridoPage(driver);
        this.appiumRobot = new AppiumRobot();
    }
    public void visualizoAMensagemNatela() {
        driverWait.until(ExpectedConditions.visibilityOf(this.seuBarrigaHibidroPage.getLogin()));
    }

    public void  selicionoAOpcao(){
        driverWait.until(ExpectedConditions.visibilityOf(this.seuBarrigaHibidroPage.getNovoUsuario()));
        this.seuBarrigaHibidroPage.getNovoUsuario().click();
    }
    public void prencherNome(String nome){ this.seuBarrigaHibidroPage.getNome().sendKeys(nome);

    }
    public  void preecherEmail(String email){this.seuBarrigaHibidroPage.getEmail().sendKeys(email);

    }
    public  void preecherSenha(String senha) {this.seuBarrigaHibidroPage.getSenha().sendKeys(senha);
    }


}
