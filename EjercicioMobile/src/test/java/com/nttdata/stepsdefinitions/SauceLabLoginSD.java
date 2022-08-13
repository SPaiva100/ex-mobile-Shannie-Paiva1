package com.nttdata.stepsdefinitions;

import com.nttdata.screens.ProductsDetailsScreen;
import com.nttdata.steps.SaucelabLoginSteps;
import com.nttdata.steps.SaucelabProductsSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceLabLoginSD {
    SaucelabLoginSteps saucelabLoginSteps;
    SaucelabProductsSteps saucelabProductsSteps;
    @Given("que me enuentro en el login de la app SauceLab")
    public void queMeEnuentroEnElLoginDeSauceLab() {
        saucelabLoginSteps.iniciar();
    }

    @When("ingreso las credenciales {string} y {string}")
    public void ingresoLasCredencialesY(String user, String password) {
        saucelabLoginSteps.sendUser(user);
        saucelabLoginSteps.sendPassword(password);
    }
    @And("hago clic en Login")
    public void hagoClicEnLogin() {
        saucelabLoginSteps.clickLogin();
    }
    @Then("muestra la interfaz de productos")
    public void muestraLaInterfazDeProductos() {
        saucelabProductsSteps.getTitulo();
    }
    @And("valido que aparezca el título {string}")
    public void validoQueAparezcaElTítulo(String titulo) {
        saucelabProductsSteps.validarTitulo(titulo);
    }
    @And("valido que al menos hay un item")
    public void validoQueAlMenosHayUnItem() {
        /*La verdad esto no creo que esté bien pero no puedo probarlo tampoco,por favor deje un comentario
        con el metodo correcto,seria de mucha ayuda */
        saucelabProductsSteps.validarProductos();
    }


}
