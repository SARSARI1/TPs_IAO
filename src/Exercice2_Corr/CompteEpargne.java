package Exercice2_Corr;

import Exercice2_Corr.Operation;
import Exercice2_Corr.TypeOperation;

public class CompteEpargne extends Compte implements ICompte {

    public CompteEpargne(String id, String dateCreation) {
        super(id, dateCreation);
    }



    @Override
    public boolean addOperation(Exercice2_Corr.Operation operation) {
        if(operation.getTypeOperation() == TypeOperation.DEBIT){
            this.getOperations().add(operation);
            setMontant(getMontant()+(operation.getMontant() * 0.05));
            return true;
        }
        else{
            if(this.getMontant() >= operation.getMontant()*0.1 &&
                    java.time.LocalDate.now().getYear() > Integer.parseInt(this.getDateCreation().split("/")[2]))
            {
                this.getOperations().add(operation);
                setMontant(getMontant()-(operation.getMontant() * 0.1));
                return true;
            }
            return false;
        }
    }
}