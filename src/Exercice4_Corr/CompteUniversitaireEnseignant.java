package Exercice4_Corr;

// Compte universitaire pour les enseignants
public class CompteUniversitaireEnseignant extends CompteUniversitaireBase {
    private Enseignant enseignant;

    public CompteUniversitaireEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }

    @Override
    public void genererLogin() {
        this.login = enseignant.getPrenom() + enseignant.getNom() + enseignant.getGrade() + "usms.ma";
    }
}