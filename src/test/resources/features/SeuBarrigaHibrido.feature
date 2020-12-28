#language: pt
#enconding: UTF-8
#Author: Marisa de Mello

  Funcionalidade: Seu Barriga Hibrido

   @mobile @seuBarrigaHibrido
   Cenario: validar o cadastro de login e senha
     Dado que esteja na aplicação
     E toco no botão "SeuBarriga Híbrido"
     E seleciono a opção Novo usuário?
     E preencho  "Marisa de Mello" "teste.marisa2@hotmail.com" "123456"
     Quando  toco no botão "Cadastrar"
     Então visualizo a mensagem na tela

