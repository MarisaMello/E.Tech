package br.com.treinamento.etech.steps;

import br.com.treinamento.etech.Funcionalidade.SwipeFuncionalidade;
import cucumber.api.java.pt.Quando;

public class SwipeSteps {

    private SwipeFuncionalidade swipeFuncionalidade;

    public SwipeSteps() {this.swipeFuncionalidade = new SwipeFuncionalidade();}

    @Quando("^movo a tela para esquerda$")
    public void movoATelaParaEsquerda() {
        this.swipeFuncionalidade.movoEsquerda();
    }
}
