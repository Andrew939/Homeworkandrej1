import Pages.RyanBalticBS;
import Pages.RyanBalticHomePage;
import org.junit.jupiter.api.Test;

public class RyanBalticTest {
    private RyanBalticBS ryanBalticBS = new RyanBalticBS();

    @Test
    public void rbTest () {
        ryanBalticBS.goToUrl1("http://qaguru.lv:8089/tickets/");

        RyanBalticHomePage balticHomePage = new RyanBalticHomePage();
    }
}
