package Exercice4_Corr;

// Compte universitaire pour les étudiants
public class CompteUniversitaireEtudiant extends CompteUniversitaireBase {
    private Etudiant etudiant;

    public CompteUniversitaireEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    @Override
    public void genererLogin() {
        this.login = etudiant.getPrenom().charAt(0) + etudiant.getNom() + "usms.ac.ma";
    }
}