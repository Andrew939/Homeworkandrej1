import Pages.RyanBalticBS;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

public class RyanObjectTest {
    private RyanBalticBS ryanBalticBS = new RyanBalticBS();
    @Test
    public void homePageUrl() {
        ryanBalticBS.goToUrl1("http://qaguru.lv:8089/tickets/");
    }
    // find first drop
    WebElement drop1 = driver.findElements(DROP1).get(2);
}
