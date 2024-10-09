package Exercice1_Corr.controller;

import Exercice1_Corr.model.Facture;

public interface IFactureSauvegarde {
    //we added this interface to make sure that we respect the Open/Closed SOLID priciple so that next time we can add other types of Save ( database for exemple)
    void saveFacture(Facture facture);
}
