package Exercice1_Corr.view;


import Exercice1_Corr.model.Facture;
import Exercice1_Corr.model.Produit;

import java.util.Map;

public class PrintFacture  implements IFactureImprimeur {
    @Override
    public void imprimer(Facture facture){
        double prix;
        for (Map.Entry mapentry : facture.getProduits().entrySet()) {
            prix = ((Produit)mapentry.getKey()).getPrix() * ((Double)mapentry.getValue());
            System.out.println(mapentry.getKey() + "\t" + mapentry.getValue() + " : " +
                    prix );
        }
        System.out.println("Prix = " + facture.getTotal());
        System.out.println("PrixTTC = " + facture.getTotalTTC());
    }
}
