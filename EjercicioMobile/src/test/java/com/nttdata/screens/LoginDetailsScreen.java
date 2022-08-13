package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class LoginDetailsScreen extends PageObject {
    //todos los identificadores son sacados del ejemplo de Automatizacion web,no pude revisar las propiedades
    @AndroidFindBy(id="user_name")
    private WebElement userInput;

    @AndroidFindBy(id="password")
    private WebElement passInput;

    @AndroidFindBy(id = "login-button")
    private WebElement loginButton;

    public void clickdUser(){
        userInput.click();
    }
    public void clickPassword(){
        passInput.click();
    }
    public void sendUser(String user){
        userInput.sendKeys(user);
    }
    public void sendPassword(String pass){
        passInput.sendKeys(pass);
    }
    public void clickLogin(){
       loginButton.click();
    }

}
