
@tag
Feature: Ajouter produit dans le panier
  apres avoir m authentifier je veux ajouter des produits dans mon panier
  
Background:  
    Given saisir url "https://automationexercise.com/login"
  # And accepter les cookies 
    When saisir adress mail suivante: "mohamed.ahmedd@gmail.com"
    And saisir mot de passe suivant: "abcdef123@"
    And cliquer sur le button se connecter
    Then vérifier que "mohamed" est le nom du profil affiché 

  @AjoutProduit
  Scenario: Ajouter Produit
    When Cliquer sur le menu Produit
    When Ajouter le produit blue top
    Then Vérifier affichage de "Added!"
    When Cliquer sur le bouton continuer shopping
    When selectionner le produit sleevless dress
    Then Vérifier affichage de "Added!"
    When cliquer sur view cart
    Then Vérifier affichage de la carte