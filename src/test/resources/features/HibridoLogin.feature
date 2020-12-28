#language: pt
#enconding: UTF-8
#Author: Marisa de Mello

  Funcionalidade: Hibrido Login

    @mobile  @HibridoLogin
    Cenario:  validar o  login com usuário cadastrado
     Dado que esteja na aplicação
     E toco no botão "SeuBarriga Híbrido"
     E seleciono  opção Login
     E preencho "teste.marisa2@hotmail.com" "123456"
     Quando toco no botão "Entrar"
     Então visualizo a mensagem na tela "Seu Barriga. Nunca mais esqueça de pagar o aluguel."

