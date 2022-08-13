package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsDetailsScreen extends PageObject {
//todos los identificadores son sacados del ejemplo de Automatizacion web,no pude revisar las propiedades
    @AndroidFindBy(id = "span.title")
    private WebElement productsTitle;

    @AndroidFindBy(id = "div.inventory_item")
    private WebElement inventory;


    public String getTitle(){
        return productsTitle.getText();
    }

    public int getItemsSize(){
        List<WebElement> items =element(inventory);
        return items.size();
    }
}
