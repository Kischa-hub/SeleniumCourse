package Javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTests {
    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDomPage().scrollToTable();
    }

}
