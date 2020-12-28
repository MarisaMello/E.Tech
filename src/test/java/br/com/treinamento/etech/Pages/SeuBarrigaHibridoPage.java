package br.com.treinamento.etech.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class SeuBarrigaHibridoPage {

        public  SeuBarrigaHibridoPage(AppiumDriver<MobileElement>driver) {
                PageFactory.initElements(new AppiumFieldDecorator(driver),this);

        }
        @AndroidFindBy(xpath = "//android.view.View[@text='Usuário inserido com sucesso']")
        private MobileElement login;

        @AndroidFindBy(xpath = "//android.view.View[@text='Novo usuário?']")
        private MobileElement novoUsuario;

        @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='nome']")
        private MobileElement nome;

        @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='email']")
        private MobileElement email;

        @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='senha']")
        private MobileElement senha;



        public MobileElement getLogin() {return  login; }

        public MobileElement getNovoUsuario() { return  novoUsuario; }

        public MobileElement getNome() { return  nome; }

        public MobileElement getEmail() { return  email; }

        public MobileElement getSenha() { return senha; }
}
