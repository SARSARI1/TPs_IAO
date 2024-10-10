package Exercice2_Corr;

import Exercice2_Corr.Operation;
import Exercice2.TypeCompte;
import Exercice2_Corr.TypeOperation;

public class CompteCourant extends Compte implements ICompte {

    public CompteCourant(String id, String dateCreation) {
        super(id, dateCreation);
    }

    @Override
    public boolean addOperation(Operation operation) {
        if (operation.getTypeOperation() == TypeOperation.DEBIT) {
            this.getOperations().add(operation);
            setMontant(getMontant() + operation.getMontant());
            return true;
        } else { // Credit

        }
    }
}
