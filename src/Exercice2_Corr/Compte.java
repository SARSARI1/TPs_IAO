package Exercice2_Corr;
import Exercice2_Corr.Operation;
import java.util.ArrayList;

public abstract class Compte {
    private ArrayList<Exercice2_Corr.Operation> operations;
    private String id;
    private String dateCreation;
    private double montant;


    public Compte(String id, String dateCreation) {
        this.id = id;
        this.dateCreation = dateCreation;

        this.operations = new ArrayList<>();
        this.montant = 0;
    }

    public ArrayList<Operation> getOperations() {
        return operations;
    }

    public void setOperations(ArrayList<Operation> operations) {
        this.operations = operations;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }


}