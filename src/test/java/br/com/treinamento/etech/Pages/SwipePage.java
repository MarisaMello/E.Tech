package br.com.treinamento.etech.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SwipePage {

    public SwipePage(AppiumDriver<MobileElement>driver){

    }
    @AndroidFindBy(xpath = "")
    private MobileElement movoEsquerda;

    public MobileElement getMovoEsquerda() {return movoEsquerda;}
}
