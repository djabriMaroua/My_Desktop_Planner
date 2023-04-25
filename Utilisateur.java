package My_Desktop_planner;

public class Utilisateur {

    /*-------------------------------------------------------*/
    // attribus
    private String Pseudo;
    private Calendrier calendrier;
    private Projet[] ListeProjets;
    private Badges badges;

    /*-------------------------------------------------------*/
    // constructor
    public Utilisateur(String Pseudo, Calendrier calendrier, Badges badges, Projet[] listeProjets) {
        this.Pseudo = Pseudo;
        this.calendrier = calendrier;
        this.badges = badges;
        this.ListeProjets = listeProjets;

    }

    // getters and setters -------------------------------------------
    public String getPseudo() {
        return Pseudo;
    }

    public void setPseudo(String Pseudo) {
        this.Pseudo = Pseudo;
    }

    public Calendrier getCalendrier() {
        return calendrier;
    }

    public void setCalendrier(Calendrier calendrier) {
        this.calendrier = calendrier;
    }

    public Projet[] getListeProjets() {
        return ListeProjets;
    }

    public void setListeProjets(Projet[] ListeProjets) {
        this.ListeProjets = ListeProjets;
    }

    public Badges getBadges() {
        return badges;
    }

    public void setBadges(Badges badges) {
        this.badges = badges;
    }

    /*-------------------------------------------------------*/
    // methods
    public void CreerProjet(Projet projet) {

    }

    public void ModifierProjet(Projet projet) {

    }

    public void SupprimerProjet(Projet projet) {

    }

}
