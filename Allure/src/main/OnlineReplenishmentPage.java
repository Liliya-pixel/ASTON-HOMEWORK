import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

class OnlineReplenishmentPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Селекторы элементов страницы 

    public OnlineReplenishmentPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    @Step("Verify payment option placeholders for {optionLabel}")
    public void verifyPaymentOptionPlaceholders(String optionLabel) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(String.format("//div[@class='payment-option' and contains(text(),'%s')]//div[@class='field-placeholder']", optionLabel))));
        List<WebElement> placeholders = driver.findElements(By.xpath(String.format("//div[@class='payment-option' and contains(text(),'%s')]//div[@class='field-placeholder']", optionLabel)));
        for (WebElement placeholder : placeholders) {
            Assert.assertFalse("Заполнитель поля пустой", placeholder.getText().isEmpty());
        }
    }

    @Step("Select communication services")
    public void selectCommunicationServices() {
        wait.until(ExpectedConditions.elementToBeClickable(communicationServicesOptionLocator)).click();
    }

    @Step("Enter phone number: {phoneNumber}")
    public void enterPhoneNumber(String phoneNumber) {
        wait.until(ExpectedConditions.elementToBeClickable(phoneNumberFieldLocator)).sendKeys(phoneNumber);
    }

    @Step("Click continue button")
    public void clickContinueButton() {
        wait.until(ExpectedConditions.elementToBeClickable(continueButtonLocator)).click();
    }

    @Step("Get payment amount")
    public String getPaymentAmount() {
        wait.until(ExpectedConditions.presenceOfElementLocated(paymentAmountLocator));
        return driver.findElement(paymentAmountLocator).getText();
    }

    @Step("Get payment phone number")
    public String getPaymentPhoneNumber() {
        wait.until(ExpectedConditions.presenceOfElementLocated(paymentPhoneLocator));
        return driver.findElement(paymentPhoneLocator).getText();
    }

    @Step("Verify card details section")
    public void verifyCardDetailsSection() {
        wait.until(ExpectedConditions.presenceOfElementLocated(cardDetailsSectionLocator));
        List<WebElement> cardDetailsPlaceholders = driver.findElements(By.xpath("//div[@id='cardDetailsSection']//div[@class='field-placeholder']"));
        for (WebElement placeholder : cardDetailsPlaceholders) {
            Assert.assertFalse("Заполнитель поля пустой", placeholder.getText().isEmpty());
        }
    }

    @Step("Verify payment system icons")
    public void verifyPaymentSystemIcons() {
        List<WebElement> icons = driver.findElements(paymentSystemIconsLocator);
        Assert.assertTrue("Иконки платежных систем не найдены", icons.size() > 0);
    }
}
