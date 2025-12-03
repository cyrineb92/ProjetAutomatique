
@tag
Feature: Authentification home page
  en tant que utilisateur, je veux me connecter

  @Authentification
  Scenario: Authentification valide 
    
    Given saisir url "https://automationexercise.com/login"
  # And accepter les cookies 
    When saisir adress mail suivante: "mohamed.ahmedd@gmail.com"
    And saisir mot de passe suivant: "abcdef123@"
    And cliquer sur le button se connecter
    Then vérifier que "mohamed" est le nom du profil affiché 
 