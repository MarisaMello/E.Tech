package br.com.treinamento.etech.Funcionalidade;

import br.com.treinamento.etech.Pages.SwipePage;
import br.com.treinamento.etech.commons.AppiumRobot;
import br.com.treinamento.etech.commons.BaseTest;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SwipeFuncionalidade extends BaseTest {

    private SwipePage swipePage;
    private AppiumRobot appiumRobot;
    private TouchAction touchAction;

    public SwipeFuncionalidade(){
        this.swipePage = new SwipePage(driver);
        this.appiumRobot = new AppiumRobot();
        this.touchAction = new TouchAction(driver);
    }
    public void movoEsquerda() {
        driverWait.until(ExpectedConditions.visibilityOf(this.driver.findElement(By.xpath("//android.view.ViewGroup"))));
        touchAction.longPress(new PointOption().withCoordinates(900,100))
                .moveTo(new PointOption().withCoordinates(100,100)).release().perform();
        touchAction.longPress(new PointOption().withCoordinates(980,100))
                .moveTo(new PointOption().withCoordinates(100,100)).release().perform();


    }
}
