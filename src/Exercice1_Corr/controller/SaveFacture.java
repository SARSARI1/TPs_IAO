package Exercice1_Corr.controller;

import Exercice1_Corr.model.Facture;

import java.util.Map;
import java.io.FileWriter;
import java.io.IOException;

public class SaveFacture  implements IFactureSauvegarde {
    @Override
    public void saveFacture(Facture facture) {
        try {
            // create a FileWriter object with the file name
            String file = "Exercice1_Corr.model.Facture".concat(String.valueOf(facture.getId()));
            FileWriter writer = new FileWriter(file);
            writer.write(facture.getId());
            // write the string to the file
            for (Map.Entry mapentry : facture.getProduits().entrySet()) {
                writer.write(mapentry.getKey().toString() + "\t" + mapentry.getValue().toString() );
            }
            writer.write("Prix = " + facture.getTotal());
            writer.write("PrixTTC = " + facture.getTotalTTC());
            // close the writer
            writer.close();

            System.out.println("Successfully wrote text to file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
