#language: pt
#enconding: UTF-8
#Author: Marisa de Mello


 Funcionalidade:  Seu Barriga Nativo

   @mobile @seuBarrigaNativo
   Cenario: Validar login e senha invalidos
     Dado que esteja na aplicação
     E toco no botão "SeuBarriga Nativo"
     E preencho  todos os campos
     Quando toco no botão "ENTRAR"
     Entao visualizo a mensagem de erro