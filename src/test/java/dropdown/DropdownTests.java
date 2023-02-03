package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOption() {
        var dropdownPage = homePage.clickDropDown();
        String option = "Option 1";
        dropdownPage.selectFromDropdown(option);
        var  selectedOptions =dropdownPage.getSelectedOptions();
        //assertEquals(1,1);
        assertEquals(selectedOptions.size(),2,"error message: Incorrect number of selection");
        assertTrue(selectedOptions.contains(option),"option not selected");
    }
}
