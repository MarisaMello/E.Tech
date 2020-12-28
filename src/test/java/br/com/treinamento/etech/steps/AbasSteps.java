package br.com.treinamento.etech.steps;

import br.com.treinamento.etech.Funcionalidade.AbasFuncionalidade;
import cucumber.api.PendingException;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Quando;

public class AbasSteps {

    private AbasFuncionalidade abasFuncionalidade;

    public  AbasSteps(){this.abasFuncionalidade = new AbasFuncionalidade();}

    @Quando("^toco no botão da Aba dois$")
    public void tocoNoBotãoDaAbaDois() {
        this.abasFuncionalidade.tocarAba2();

    }

    @E("^visualizo o texto na tela \"([^\"]*)\"$")
    public void visualizoOTextoNaTela(String texto) {
        this.abasFuncionalidade.validarMensagem(texto);
    }
}
