package fileUpload;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload() {
        var fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile("/Users/kareem.elhosseny/Documents/KareemWork/Automation/IntellijWorkspace/SeleniumCourse/resources/chromedriver");
        Assert.assertEquals(fileUploadPage.getUploadedFileName(),"chromedriver","The Uploaded file name is not correct");
    }
}
