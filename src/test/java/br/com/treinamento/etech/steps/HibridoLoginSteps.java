package br.com.treinamento.etech.steps;

import br.com.treinamento.etech.Funcionalidade.HibridoLoginFuncionalidade;
import cucumber.api.PendingException;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;

public class HibridoLoginSteps {

    private HibridoLoginFuncionalidade hibridoLoginFuncionalidade;

    public HibridoLoginSteps(){ this.hibridoLoginFuncionalidade = new HibridoLoginFuncionalidade();}



    @E("^preencho \"([^\"]*)\" \"([^\"]*)\"$")
    public void preencho(String email, String senha)  {
        this.hibridoLoginFuncionalidade.preecherEmail(email);
        this.hibridoLoginFuncionalidade.preecherSenha(senha);

    }

    @E("^seleciono  opção Login$")
    public void selecionoOpçãoLogin() {
        this.hibridoLoginFuncionalidade.selicionoAOpcao();

    }

    @Então("^visualizo a mensagem na tela \"([^\"]*)\"$")
    public void visualizoAMensagemNaTela(String mensagem) {
        this.hibridoLoginFuncionalidade.visualizoAMensagem(mensagem);


    }
}
