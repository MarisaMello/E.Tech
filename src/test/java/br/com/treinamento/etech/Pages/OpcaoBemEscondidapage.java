package br.com.treinamento.etech.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class OpcaoBemEscondidapage {

    public OpcaoBemEscondidapage(AppiumDriver<MobileElement>driver) {
    }

    @AndroidFindBy(xpath = "")
    private  MobileElement botao;

    public MobileElement getBotao() {return botao;}
}
