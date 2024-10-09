package Exercice2_Corr;

import  Exercice2_Corr.TypeOperation;

public class Operation {
    private double montant;
    private TypeOperation typeOperation;

    public Operation(double montant,  Exercice2_Corr.TypeOperation typeOperation) {
        this.montant = montant;
        this.typeOperation = typeOperation;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public TypeOperation getTypeOperation() {
        return typeOperation;
    }

    @Override
    public String toString() {
        return "Exercice2.Operation{" +
                "montant=" + montant +
                ", typeOperation=" + typeOperation +
                '}';
    }

}