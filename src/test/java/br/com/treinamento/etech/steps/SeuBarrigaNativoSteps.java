package br.com.treinamento.etech.steps;

import br.com.treinamento.etech.Funcionalidade.SeuBarrigaNativoFuncionalidade;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;

public class SeuBarrigaNativoSteps {

    private SeuBarrigaNativoFuncionalidade seuBarrigaNativoFuncionalidade;

    public SeuBarrigaNativoSteps() {this.seuBarrigaNativoFuncionalidade = new SeuBarrigaNativoFuncionalidade();}


    @E("^preencho  todos os campos$")
    public void preenchoTodosOsCampos() { this.seuBarrigaNativoFuncionalidade.preencherCampoNome();


    }

    @Entao("^visualizo a mensagem de erro$")
    public void visualizoAMensagemDeErro() {
        Assert.assertTrue(this.seuBarrigaNativoFuncionalidade.validarMensagemDeErro());
    }
}
