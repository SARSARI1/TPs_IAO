package Exercice1_Corr;

import Exercice1_Corr.controller.IFactureSauvegarde;
import Exercice1_Corr.controller.SaveFacture;
import Exercice1_Corr.model.Facture;
import Exercice1_Corr.model.Produit;
import Exercice1_Corr.view.IFactureImprimeur;
import Exercice1_Corr.view.PrintFacture;

public class Main {
    public static void main(String[] args) {
        // Création d'une nouvelle facture
        Facture facture = new Facture(1);

        // Création de produits
        Produit produit1 = new Produit();
        produit1.setLibele("Produit A");
        produit1.setPrix(100);

        Produit produit2 = new Produit();
        produit2.setLibele("Produit B");
        produit2.setPrix(200);

        // Ajout des produits à la facture
        facture.addProduit(produit1, 2);
        facture.addProduit(produit2, 3);

        // Définir la TVA
        Facture.setTVA(2);

        // Affichage de la facture (vue)
        IFactureImprimeur imprimeur = new PrintFacture();
        imprimeur.imprimer(facture);

        // Sauvegarde de la facture (contrôleur)
        IFactureSauvegarde sauvegarde = new SaveFacture();
        sauvegarde.saveFacture(facture);
    }
}
