package Exercice4_Corr;

public class Main {
    public static void main(String[] args) {
        // Création d'un enseignant et d'un compte universitaire pour enseignant
        Enseignant enseignant = new Enseignant("Doe", "John", "Professeur");
        CompteUniversitaire compteEnseignant = new CompteUniversitaireEnseignant(enseignant);
        compteEnseignant.genererLogin();
        System.out.println("Login Enseignant : " + compteEnseignant.getLogin());

        // Création d'un étudiant et d'un compte universitaire pour étudiant
        Etudiant etudiant = new Etudiant("Smith", "Jane", 12345);
        CompteUniversitaire compteEtudiant = new CompteUniversitaireEtudiant(etudiant);
        compteEtudiant.genererLogin();
        System.out.println("Login Étudiant : " + compteEtudiant.getLogin());
    }
}
