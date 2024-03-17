package org.DanCa.StepsDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.DanCa.Pages.CartPage;
import org.DanCa.Hooks.Hooks;
import org.testng.Assert;

public class AddToCartDefinitions {

    private CartPage cart;

    public AddToCartDefinitions(){
        this.cart = new CartPage(Hooks.getWebDriver());
    }

    // ########## TEST-AC001 ##########
    @Cuando("el usuario agrega un producto al carrito")
    public void elUsuarioAgregaUnProductoAlCarrito() {
        cart.ingresarSeccionCamaras();
        cart.agregarAlCarrito();
    }

    @Entonces("se valida que se ha agregado el producto en el carrito")
    public void seValidaQueSeHaAgregadoElProductoEnElCarrito() {
        Assert.assertTrue(cart.isSuccess());
        Assert.assertTrue(cart.productIsAdded());

    }
}
