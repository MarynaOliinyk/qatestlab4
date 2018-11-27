package com.qatestlab.prestashopautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import static com.qatestlab.prestashopautomation.utils.TestData.Shop.SHOP_BASE_URL;

public class ShopPage extends AbstractPage {
    private WebElement allProductsButton;

    private By allProductsButtonLocator = By.xpath("//a[@class='all-product-link pull-xs-left pull-md-right h4']");

    public ShopPage(EventFiringWebDriver eventFiringWebDriver) {
        super(eventFiringWebDriver);
    }

    public void showAllProducts() {
        allProductsButton = eventFiringWebDriver.findElement(allProductsButtonLocator);
        allProductsButton.click();
    }
}
