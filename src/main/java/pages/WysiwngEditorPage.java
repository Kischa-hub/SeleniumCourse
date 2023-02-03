package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwngEditorPage {
    private WebDriver driver;
    private String editorIframeId="mce_0_ifr";
    private By textArea = By.id("tinymce");
    public WysiwngEditorPage(WebDriver driver){
        this.driver= driver;
    }

    public void clearTextArea(){
        switchToArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setTextArea(String text){
        switchToArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    private void switchToArea(){
        driver.switchTo().frame(editorIframeId);
    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }




}
