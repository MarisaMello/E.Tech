package br.com.treinamento.etech.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class SeuBarrigaNativoPage {

    public SeuBarrigaNativoPage(AppiumDriver<MobileElement> drive) {
        PageFactory.initElements(new AppiumFieldDecorator(drive), this);
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Nome']")
    private MobileElement login;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Senha']")
    private MobileElement senha;


    public MobileElement getlogin () { return login; }
    public MobileElement getsenha () { return senha; }

}