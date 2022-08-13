package com.nttdata.steps;

import com.nttdata.screens.LoginDetailsScreen;
import com.nttdata.screens.ProductsDetailsScreen;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

import java.util.concurrent.TimeUnit;

public class SaucelabLoginSteps {

    ProductsDetailsScreen productsDetailsScreen;
    LoginDetailsScreen loginDetailsScreen;

    public void iniciar(){
        loginDetailsScreen.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void sendUser(String user){
        loginDetailsScreen.clickdUser();
        loginDetailsScreen.sendUser(user);
    }
    public void sendPassword(String pass){
        loginDetailsScreen.clickPassword();
        loginDetailsScreen.sendPassword(pass);
    }
    public void clickLogin(){
        loginDetailsScreen.clickLogin();
    }
}
