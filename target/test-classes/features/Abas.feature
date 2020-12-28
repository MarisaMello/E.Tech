#language: pt
#enconding: UTF-8
#Author: Marisa de Mello

  Funcionalidade: Abas

    @mobile @abas
    Cenario: validar as abas
    Dado que esteja na aplicação
    E toco no botão "Abas"
    E visualizo o texto na tela "Este é o conteúdo da Aba 1"
    Quando toco no botão da Aba dois
    Então  visualizo o texto na tela "Este é o conteúdo da Aba 2"
