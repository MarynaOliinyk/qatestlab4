package com.qatestlab.prestashopautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import static org.testng.Assert.assertEquals;

public class ShopAllProductsPage extends AbstractPage {

    private WebElement searchProduct;
    private WebElement nextLink;

    private By nextLinkLocator = By.xpath("//a[@class='next js-search-link']");

    public ShopAllProductsPage(EventFiringWebDriver eventFiringWebDriver) {
        super(eventFiringWebDriver);
    }

    public void searchProducts(String productName, String by) {
        searchProduct = eventFiringWebDriver.findElement(By.xpath(by));
        if (!searchProduct.isDisplayed()) {
            nextLink = eventFiringWebDriver.findElement(nextLinkLocator);
            nextLink.click();
        } else
            searchProduct = eventFiringWebDriver.findElement(By.xpath(by));
        assertEquals(searchProduct.getText(), (productName));//первая буква конвертируется в большую,не знаю как исправить equalsToIgnorecase не походит
    }
}
