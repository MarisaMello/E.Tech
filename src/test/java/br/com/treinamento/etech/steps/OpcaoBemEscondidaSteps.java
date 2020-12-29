package br.com.treinamento.etech.steps;

import br.com.treinamento.etech.Funcionalidade.OpcaoBemEscondidaFuncionalidade;
import cucumber.api.java.pt.Quando;

public class OpcaoBemEscondidaSteps {

    private OpcaoBemEscondidaFuncionalidade opcaoBemEscondidaFuncionalidade;

    public OpcaoBemEscondidaSteps(){this.opcaoBemEscondidaFuncionalidade = new OpcaoBemEscondidaFuncionalidade();}

    @Quando("^toco no botão Opção bem escondida$")
    public void tocoNoBotãoOpçãoBemEscondida() {
        this.opcaoBemEscondidaFuncionalidade.tocarbotão();

    }
}
