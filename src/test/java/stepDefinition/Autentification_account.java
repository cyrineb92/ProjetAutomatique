package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import hooks.SetUp;
import io.cucumber.java.en.*;

import pageObject.PageHome;
import pageObject.pageSignUP;


public class Autentification_account {
	
	public static WebDriver driver = SetUp.driver;
	
	PageHome home = new PageHome(driver);
	pageSignUP sign = new pageSignUP(driver);
	
	
	@Given("saisir url {string}")
	public void saisir_url(String string) {
	    home.acceder_a_url(string);
	}

//	@Given("accepter les cookies")
//	public void accepter_les_cookies() {
//	    sign.cliquer_pour_accepter_cookies();
//	}

	@When("saisir adress mail suivante: {string}")
	public void saisir_adress_mail_suivante(String string) {
	    sign.ecrire_dans_champs_mail(string);
	}

	@When("saisir mot de passe suivant: {string}")
	public void saisir_mot_de_passe_suivant(String string) {
	   sign.ecrire_dans_champs_mdp(string);
	}

	@When("cliquer sur le button se connecter")
	public void cliquer_sur_le_button_se_connecter() {
	    sign.cliquer_sur_login_pour_se_connecter();
	}

	@Then("vérifier que {string} est le nom du profil affiché")
	public void vérifier_que_est_le_nom_du_profil_affiché(String string) {
		Assert.assertEquals(string,home.recuperer_le_nom_du_profil());
	}


	
}
