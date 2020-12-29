package br.com.treinamento.etech.Funcionalidade;

import br.com.treinamento.etech.Pages.OpcaoBemEscondidapage;
import br.com.treinamento.etech.commons.AppiumRobot;
import br.com.treinamento.etech.commons.BaseTest;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class OpcaoBemEscondidaFuncionalidade extends BaseTest{

        private OpcaoBemEscondidapage opcaoBemEscondidapage;
        private AppiumRobot appiumRobot;
        private TouchAction touchAction;

        public OpcaoBemEscondidaFuncionalidade(){
            this.opcaoBemEscondidapage = new OpcaoBemEscondidapage(driver);
            this.appiumRobot = new AppiumRobot();
            this.touchAction = new TouchAction(driver);

        }
        public void tocarbotão(){
            touchAction.longPress(new PointOption().withCoordinates(100,1500))
                    .moveTo(new PointOption().withCoordinates(100,100)).release().perform();
            this.appiumRobot.clicarPorTexto("Opção bem escondida");
//            this.opcaoBemEscondidapage.getBotao().click();
    }


}
