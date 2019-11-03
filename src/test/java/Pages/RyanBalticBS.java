package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RyanBalticBS {
    private WebDriver driver;

    public RyanBalticBS() {
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    public void goToUrl1(String url) {
        if (url.startsWith("http://") || url.startsWith("http://")) {


        } else {
            url = "http://" + url;
        }
        driver.get(url);
    }
    WebElement select = driver.findElement(By.name("droplist"));
    Select dropDown = new Select(select);
    String selected = dropDown.getFirstSelectedOption().getText();
    if (selected.equals(2)) {

    }

}