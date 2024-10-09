package Exercice2_Corr;

public class Main {
    public static void main(String[] args) {
        // Créer un compte courant
        CompteCourant compteCourant = new CompteCourant("CC001", "10/10/2022");
        System.out.println("Solde initial (CompteCourant) : " + compteCourant.getMontant());

        // Effectuer quelques opérations en utilisant des valeurs d'énumération en majuscules
        Operation debit1 = new Operation(100, Exercice2_Corr.TypeOperation.DEBIT); // Changé en majuscules
        Operation credit1 = new Operation(50, Exercice2_Corr.TypeOperation.CREDIT); // Changé en majuscules

        // Ajouter des opérations au compte courant
        compteCourant.addOperation(debit1);
        System.out.println("Après le débit de 100 : " + compteCourant.getMontant());

        compteCourant.addOperation(credit1);
        System.out.println("Après le crédit de 50 : " + compteCourant.getMontant());

        // Afficher les opérations
        System.out.println("Opérations sur CompteCourant : " + compteCourant.getOperations());

        // Créer un compte épargne
        CompteEpargne compteEpargne = new CompteEpargne("CE001", "01/01/2020");
        System.out.println("Solde initial (CompteEpargne) : " + compteEpargne.getMontant());

        // Effectuer quelques opérations pour le CompteEpargne
        Operation debit2 = new Operation(200, Exercice2_Corr.TypeOperation.DEBIT); // Changé en majuscules
        Operation credit2 = new Operation(100, Exercice2_Corr.TypeOperation.CREDIT); // Changé en majuscules

        // Ajouter des opérations au compte épargne
        compteEpargne.addOperation(debit2);
        System.out.println("Après le débit de 200 : " + compteEpargne.getMontant());

        compteEpargne.addOperation(credit2);
        System.out.println("Après le crédit de 100 : " + compteEpargne.getMontant());

        // Afficher les opérations
        System.out.println("Opérations sur CompteEpargne : " + compteEpargne.getOperations());
    }

}
