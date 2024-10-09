package Exercice1_Corr.view;

import Exercice1_Corr.model.Facture;

public interface IFactureImprimeur {
    //we added this interface to make sure that we respect the Open/Closed SOLID priciple so that next time we can add other types of print
    void imprimer(Facture facture);

}
