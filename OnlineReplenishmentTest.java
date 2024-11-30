import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlineReplenishmentTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        // Укажите путь к драйверу Chrome
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testOnlineReplenishmentBlock() {
        // Открываем сайт МТС
        driver.get("https://www.mts.by/");

        // Проверка названия блока
        WebElement blockTitle = driver.findElement(By.xpath("//h2[contains(text(), 'Онлайн пополнение без комиссии')]"));
        Assert.assertNotNull("Блок не найден", blockTitle);
        Assert.assertEquals("Название блока не совпадает", "Онлайн пополнение без комиссии", blockTitle.getText());

        // Проверка наличия логотипов платежных систем
        Assert.assertTrue("Логотип Visa не найден", isElementPresent(By.xpath("//img[@alt='Visa']")));
        Assert.assertTrue("Логотип MasterCard не найден", isElementPresent(By.xpath("//img[@alt='MasterCard']")));
        Assert.assertTrue("Логотип WebMoney не найден", isElementPresent(By.xpath("//img[@alt='WebMoney']")));
        // Добавьте другие логотипы по необходимости

        // Проверка работы ссылки "Подробнее о сервисе"
        WebElement moreInfoLink = driver.findElement(By.linkText("Подробнее о сервисе"));
        moreInfoLink.click();
        Assert.assertTrue("Не удалось перейти на страницу с информацией", driver.getCurrentUrl().contains("service-info-url")); // Укажите актуальный URL

        // Заполнение полей и проверка кнопки "Продолжить"
        driver.navigate().back(); // Вернуться на предыдущую страницу
        WebElement serviceRadioButton = driver.findElement(By.id("serviceRadioButtonId")); // Замените на актуальный ID
        serviceRadioButton.click();

        WebElement phoneNumberField = driver.findElement(By.id("phoneNumberFieldId")); // Замените на актуальный ID
        phoneNumberField.sendKeys("297777777");

        WebElement continueButton = driver.findElement(By.id("continueButtonId")); // Замените на актуальный ID
        continueButton.click();

        // Проверка успешного перехода или сообщения
        Assert.assertTrue("Не удалось продолжить процесс", isElementPresent(By.id("successMessageId"))); // Замените на актуальный ID
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @After
    public void tearDown() {
        // Закрываем браузер
        if (driver != null) {
            driver.quit();
        }
    }
}

