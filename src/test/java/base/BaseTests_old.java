/*package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests_old {
    private WebDriver driver;

    public void setUP() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        //driver.manage().window().fullscreen();
        //driver.manage().window().setSize(new Dimension(414,896));

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        WebElement shiftingLink = driver.findElement(By.linkText("Shifting Content"));
        shiftingLink.click();

        WebElement example1Link = driver.findElement(By.linkText("Example 1: Menu Element"));
        example1Link.click();

        List<WebElement> menuLinks = driver.findElements(By.tagName("li"));
        System.out.println("menuLiks is "+menuLinks.size());

        System.out.println(driver.getTitle());
        //driver.quit();
    }

    public static void main(String[] args) {
        BaseTests_old test = new BaseTests_old();
        test.setUP();
    }
}

 */
