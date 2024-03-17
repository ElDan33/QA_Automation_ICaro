package org.DanCa.StepsDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.DanCa.Pages.FavoritosPage;
import org.DanCa.Hooks.Hooks;
import org.testng.Assert;

public class WishListDefinitions {

    private FavoritosPage  favpage;

    public WishListDefinitions(){
        this.favpage = new FavoritosPage(Hooks.getWebDriver());
    }

    // ########## TEST-FV001 ##########
    @Cuando("el usuario agrega un producto a favoritos")
    public void elUsuarioAgregaUnProductoAFavoritos() {
        favpage.ingresarSeccionCamaras();
        favpage.agregarUnFavorito();
        favpage.clickWishList();
    }

    @Entonces("se valida que se agregó un producto en favoritos")
    public void seValidaQueSeAgregóUnProductoEnFavoritos() {
        Assert.assertTrue(favpage.productIsDisplayed());
    }


}
