package br.com.treinamento.etech.steps;

import br.com.treinamento.etech.Funcionalidade.SeuBarrigaHibridoFuncionalidade;
import cucumber.api.PendingException;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;

public class SeuBarrigaHibridoSteps {

    private SeuBarrigaHibridoFuncionalidade seuBarrigaHibidroFuncionalidade;

    public SeuBarrigaHibridoSteps() {this.seuBarrigaHibidroFuncionalidade = new SeuBarrigaHibridoFuncionalidade();}



    @Então("^visualizo a mensagem na tela$")
    public void visualizoAMensagemNaTela() { this.seuBarrigaHibidroFuncionalidade.visualizoAMensagemNatela();
    }


    @E("^seleciono a opção Novo usuário\\?$")
    public void selecionoAOpçãoNovoUsuário() { this.seuBarrigaHibidroFuncionalidade.selicionoAOpcao();
    }

    @E("^preencho  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void preencho(String nome, String email, String senha) {
        this.seuBarrigaHibidroFuncionalidade.prencherNome(nome);
        this.seuBarrigaHibidroFuncionalidade.preecherEmail(email);
        this.seuBarrigaHibidroFuncionalidade.preecherSenha(senha);

    }
}
