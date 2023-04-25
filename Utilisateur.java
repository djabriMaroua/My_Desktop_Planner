package My_Desktop_planner;

import java.util.ArrayList;

public class Utilisateur {

    /*-------------------------------------------------------*/
    // attribus
    private String Pseudo;
    private Calendrier calendrier;
    private ArrayList<Projet> ListeProjets;
    private Badges badges;

    /*-------------------------------------------------------*/
    public Utilisateur(String Pseudo, Calendrier calendrier, Badges badges, ArrayList<Projet> ListeProjets) {
        this.Pseudo = Pseudo;
        this.calendrier = calendrier;
        this.badges = badges;
        this.ListeProjets = ListeProjets;
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

    public ArrayList<Projet> getListeProjets() {
        return ListeProjets;
    }

    public void setListeProjets(ArrayList<Projet> ListeProjets) {
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
        if (ListeProjets.contains(projet)) {
            System.out.println("ce projet existe deja , choisissez un autre nom ");
        } else {
            ListeProjets.add(projet);
        }

    }

    /*-------------------------------------------------------*/
    public void ModifierProjet(Projet projet, String nouveauNom, String nouvelleDescription, Tache tacheASupprimer) {
        // Trouver l'index du projet dans la liste des projets de l'utilisateur
        int index = ListeProjets.indexOf(projet);
    
        // Vérifier que le projet existe bien dans la liste
        if (index != -1) {
            
            // Modifier les informations du projet si elles ont été passées en paramètre
            if (nouveauNom != null) {
                ListeProjets.get(index).setNom(nouveauNom);
            }
            if (nouvelleDescription != null) {
                ListeProjets.get(index).setDescription(nouvelleDescription);
            }
            if (tacheASupprimer != null) {
                ListeProjets.get(index).SupprimerTache(tacheASupprimer);
            }
        }
    }
    
    /*-------------------------------------------------------*/
    public void SupprimerProjet(Projet projet) {
        if (ListeProjets.contains(projet)) {
            ListeProjets.remove(projet);
            System.out.println("le prjet a été supprimé avec succes ");
        } else {
            System.out.println("le projet n'existe pas ! ");
        }

    }

}
