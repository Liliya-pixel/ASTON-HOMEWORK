import io.qameta.allure.*;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

@Epic("Online Replenishment Tests")
@Feature("Payment Processing")
public class OnlineReplenishmentTest {
    private WebDriver driver;
    private OnlineReplenishmentPage page;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        page = new OnlineReplenishmentPage(driver);
    }

    @Test
    @Description("Test the online replenishment flow for communication services.")
    @Step("Starting the online replenishment test")
    public void testOnlineReplenishmentFlow() {
        driver.get("https://www.mts.by/");

        page.verifyPaymentOptionPlaceholders("Услуги связи");
        page.verifyPaymentOptionPlaceholders("Домашний интернет");
        page.verifyPaymentOptionPlaceholders("Рассрочка");
        page.verifyPaymentOptionPlaceholders("Задолженность");

        page.selectCommunicationServices();
        page.enterPhoneNumber("297777777");
        page.clickContinueButton();

        Assert.assertEquals("Неверная сумма платежа", "41.90 руб", page.getPaymentAmount());
        Assert.assertEquals("Неверный номер телефона", "297777777", page.getPaymentPhoneNumber());
        page.verifyCardDetailsSection();
        page.verifyPaymentSystemIcons();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
