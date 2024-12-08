import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MTSOnlinePaymentTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        // Инициализация веб-драйвера 
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testOnlinePaymentBlock() {
        driver.get("https://mts.by");  

        // 1. Проверить название указанного блока
        WebElement titleElement = driver.findElement(By.xpath("//*[@id='pay-section']/div/div[1]/section/div/h2"));
        assertEquals("Онлайн пополнение\nбез комиссии", titleElement.getText());

        // 2. Проверить наличие логотипов платежных систем
        WebElement logosContainer = driver.findElement(By.xpath("//*[@id='pay-section']/div/div[1]/section/div/div[3]/ul"));
        WebElement[] logos = logosContainer.findElements(By.tagName("img")).toArray(new WebElement[0]);
        String[] expectedLogos = {"Visa", "Verified By Visa", "MasterCard", "MasterCard Secure Code", "Белкарт"};
        String[] actualLogos = new String[logos.length];
        for (int i = 0; i < logos.length; i++) {
            actualLogos[i] = logos[i].getAttribute("alt");
        }
        assertArrayEquals(expectedLogos, actualLogos);

        // 3. Проверить работу ссылки "Подробнее о сервисе"
        WebElement moreInfoLink = driver.findElement(By.xpath("//*[@id='pay-section']/div/div[1]/section/div/a"));
        moreInfoLink.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlToBe("https://mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"));
        assertEquals("https://mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/", driver.getCurrentUrl());

        // 4. Заполнить поля и проверить работу кнопки "Продолжить" (проверяем только вариант "Услуги связи")
        WebElement selectElement = driver.findElement(By.id("pay"));
        selectElement.click();
        WebElement optionElement = driver.findElement(By.xpath("//*[@id='pay']/option[text()='Услуги связи']"));
        optionElement.click();

        WebElement phoneField = driver.findElement(By.id("connection-phone"));
        phoneField.sendKeys("297777777");

        WebElement sumField = driver.findElement(By.id("connection-sum"));
        sumField.sendKeys("100");

        WebElement continueButton = driver.findElement(By.xpath("//*[@id='pay-connection']/button"));
        continueButton.click();

        // Проверка, что форма отправлена 
        wait.until(ExpectedConditions.urlContains("https://mts.by/payment/confirmation"));
        assertTrue(driver.getCurrentUrl().contains("https://mts.by/payment/confirmation"));
    }

    @After
    public void tearDown() {
        // Закрытие браузера после выполнения теста
        if (driver != null) {
            driver.quit();
        }
    }
}
