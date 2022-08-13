package com.nttdata.steps;

import com.nttdata.screens.LoginDetailsScreen;
import com.nttdata.screens.ProductsDetailsScreen;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SaucelabProductsSteps  {

    ProductsDetailsScreen productsDetailsScreen;
    LoginDetailsScreen loginDetailsScreen;

    @Step("Se muestra la pagina de Productos ")
    public String getTitulo(){
        return productsDetailsScreen.getTitle();
    }
    @Step("Valida el titulo")
    public void validarTitulo(String titulo){
        Assert.assertEquals(this.getTitulo(), titulo);
    }
    @Step("Valida el que exista al menos un producto")
    public void validarProductos(){
        int itemsListSize = productsDetailsScreen.getItemsSize();
        Assert.assertEquals(itemsListSize > 0, "El tamaño de la lista es: " + itemsListSize);
    }

}
