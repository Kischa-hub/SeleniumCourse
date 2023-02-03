package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver){
        this.driver=driver;
        navigate=driver.navigate();
    }

    public void goBack(){
       navigate.back();
    }

    public void goForward(){
        navigate.forward();
    }
    public void refresh(){
        navigate.refresh();
    }

    public void switchToTab(String tabTitle){
        var windows = driver.getWindowHandles();
        System.out.println("Number of tabs: = " + windows.size());

    }

    public void goTo(String url){
        navigate.to(url);
    }

}
