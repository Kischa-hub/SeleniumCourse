package hover;

import base.BaseTests;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class HoverTests extends BaseTests {

    @Test
    public void testHoverUser1() {
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(), "caption is not displayed");
        assertEquals(caption.getTitle(), "name: user1", "caption title is not correct");
        assertEquals(caption.getLinkText(), "View profile", "caption link text is not correct");
        assertTrue(caption.getLink().endsWith("/users/1"), "caption link is not correct");

    }

}
