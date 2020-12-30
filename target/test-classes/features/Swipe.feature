#language: pt
#enconding: UTF-8
#Author: Marisa de Mello

  Funcionalidade:
    @mobile @swipe
      Cenario: mover tela
      Dado que esteja na aplicação
      E toco no botão "Swipe"
      Quando movo a tela para esquerda
      Então visualizo o texto na tela "Chegar até o fim!"