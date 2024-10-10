package Exercice4_Corr;

// Classe abstraite de base pour les comptes universitaires
public abstract class CompteUniversitaireBase implements CompteUniversitaire {
    protected String login;

    @Override
    public String getLogin() {
        return login;
    }
}