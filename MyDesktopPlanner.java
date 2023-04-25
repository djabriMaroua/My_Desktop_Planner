package My_Desktop_planner;

import java.util.ArrayList;

public class MyDesktopPlanner {
  /*-------------------------------------------------------*/
  // attribus
  private ArrayList<Utilisateur> ListeUtilisateurs;

  // constructor -------------------------------------------
  public MyDesktopPlanner(ArrayList<Utilisateur> ListeUtilisateurs) {
    this.ListeUtilisateurs = ListeUtilisateurs;
  }

  // methods
  /*-------------------------------------------------------*/
  public void ajouterUtilisateur(Utilisateur utilisateur) {
    ListeUtilisateurs.add(utilisateur);
  }

  /*-------------------------------------------------------*/
  public void supprimerUtilisateur(Utilisateur utilisateur) {
  ListeUtilisateurs.remove(utilisateur); 
  }

  /*-------------------------------------------------------*/
  public void InstallerApp() {

  }
}
