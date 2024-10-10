package Exercice4_Corr;

// Classe Enseignant
public class Enseignant {
    private String nom;
    private String prenom;
    private String grade;

    public Enseignant(String nom, String prenom, String grade) {
        this.nom = nom;
        this.prenom = prenom;
        this.grade = grade;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getGrade() {
        return grade;
    }
}