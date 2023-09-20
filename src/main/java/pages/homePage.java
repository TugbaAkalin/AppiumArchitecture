package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import utils.elementHelper;

public class homePage {

    AppiumDriver driver;
    elementHelper elementHelper;

    By image = AppiumBy.className("android.widget.ImageView");
    By manButton = AppiumBy.id("trendyol.com:id/buttonSelectGenderMan");
    By text = AppiumBy.id("trendyol.com:id/textViewOpenNotification");

    public homePage(AppiumDriver appiumDriver) {
        driver = appiumDriver;
        elementHelper = new elementHelper(appiumDriver);
    }

    public void checkImage() {
        elementHelper.checkElement(image);
        //elementHelper.findElement(image).isDisplayed();
        //driver.findElement(image).isDisplayed();
    }

    public String getText() {
        return elementHelper.getText(text);
        //return elementHelper.findElement(text).getText();
        //return driver.findElement(text).getText();
    }

    public void clickManButton() {
        elementHelper.click(manButton);
        //elementHelper.findElement(manButton).click();
        // driver.findElement(manButton).click();
    }
}
