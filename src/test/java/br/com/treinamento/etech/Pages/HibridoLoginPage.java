package br.com.treinamento.etech.Pages;

import br.com.treinamento.etech.commons.AppiumRobot;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class HibridoLoginPage {

    public HibridoLoginPage(AppiumDriver<MobileElement>driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    @AndroidFindBy(xpath = "//android.widget.EditText [@resource-id=\"email\"]")
    private MobileElement email;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='senha']")
    private MobileElement senha;

    @AndroidFindBy(xpath = "//android.view.View[@text=\"Login\"]")
    private MobileElement login;


    public MobileElement getEmail() {return  email;}

    public MobileElement getSenha() { return senha;}

    public MobileElement getLogin() { return login;}




}
