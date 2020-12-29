#language: pt
#enconding: UTF-8
#Author: Marisa de Mello

  Funcionalidade:
    @mobile @opção
    Cenario: validar a tela 
    Dado que esteja na aplicação
    Quando toco no botão Opção bem escondida
    Então visualizo o texto na tela "Você achou essa opção"
    E toco no botão "OK"