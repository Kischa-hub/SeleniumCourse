package wait;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitTests extends BaseTests {
    @Test
    public void testWaitUntilHidden(){
        var  dynamicLoadingPage = homePage.clickDynamicLoading().clickExample1();
        dynamicLoadingPage.clickStartButton();
        Assert.assertEquals(dynamicLoadingPage.getFinishLabelText(),"Hello World!", "The text is not correct");
    }
}
