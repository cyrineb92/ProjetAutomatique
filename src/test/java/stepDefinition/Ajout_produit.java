package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import hooks.SetUp;
import io.cucumber.java.en.*;

import pageObject.PageCart;
import pageObject.PageHome;
import pageObject.PageProduct;



public class Ajout_produit {

	
public static WebDriver driver = SetUp.driver;
	
	PageHome home = new PageHome(driver);
	PageProduct produit = new PageProduct(driver);
	PageCart cart = new PageCart(driver);
	
	
	@When("Cliquer sur le menu Produit")
	public void cliquer_sur_le_menu_produit() {
	    home.cliquer_sur_boutton_produits();
	}

	@When("Ajouter le produit blue top")
	public void ajouter_le_produit_blue_top() {
	    produit.ajouter_blue_top_dans_le_panier();
	}

	@Then("Vérifier affichage de {string}")
	public void vérifier_affichage_de(String string) throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertEquals(string, produit.recuperer_message_added());
	}

	@When("Cliquer sur le bouton continuer shopping")
	public void cliquer_sur_le_bouton_continuer_shopping() {
	    produit.Cliquer_sur_continuer_shop();
	}

	@When("selectionner le produit sleevless dress")
	public void selectionner_le_produit_sleevless_dress() {
	    produit.ajouter_sleevless_dress_dans_le_panier();
	}

	@When("cliquer sur view cart")
	public void cliquer_sur_view_cart() {
	    produit.Aller_voi_panier();
	}

	@Then("Vérifier affichage de la carte")
	public void vérifier_affichage_de_la_carte() {
	    Assert.assertEquals(cart.statut_du_bouton_chekout(), true);
	}
}
