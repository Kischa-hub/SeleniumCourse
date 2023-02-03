package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertsPage= homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        Assert.assertEquals(alertsPage.getResultText(),"You successfully clicked an alert","Results text incorrect");
    }

    @Test
    public void testDismissAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getMessageText();
        alertsPage.alert_clickToDismiss();
        Assert.assertEquals(text,"I am a JS Confirm","the message text is not correct");
        Assert.assertEquals(alertsPage.getResultText(),"You clicked: Cancel","the mesage is not correct");
        //You clicked: Cancel
    }

    @Test
    public void testSetInputInAlert(){
        var alertspage = homePage.clickJavaScriptAlerts();
        alertspage.triggerPrompt();
        String text = "TAU rocks!";
        alertspage.alert_setInput(text);
        alertspage.alert_clickToAccept();
        //Assert.assertEquals(alertspage.getResultText(),"You entered: "+text, "Results Text is incorrect");
        Assert.assertTrue(alertspage.getResultText().contains(text),"Results Text is incorrect" );
    }
}
