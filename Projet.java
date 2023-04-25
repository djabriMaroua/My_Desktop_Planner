package My_Desktop_planner;

import java.util.ArrayList;

public class Projet {
    /*-------------------------------------------------------*/
    //attribus 
    private ArrayList<Tache> ListeTaches;
    private String nom ; 
    private String Description ; 
    //etat d'avancement 



    //construtor ---------------------------------------------
    public Projet(ArrayList<Tache> ListeTaches, String nom, String Description, int etatAvancement) {
        this.ListeTaches = ListeTaches;
        this.nom = nom;
        this.Description = Description;
        //this.etatAvancement = etatAvancement;
    } 


    //getters and setters -----------------------------------------
    public ArrayList<Tache> getListeTaches() {
        return ListeTaches;
    }

    public void setListeTaches(ArrayList<Tache> ListeTaches) {
        this.ListeTaches = ListeTaches;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

   


    /*-------------------------------------------------------*/
    //methods
    public  void AjouterTache(Tache tache ) {


    }

    public   void SupprimerTache(Tache tache ) {
        
            if (ListeTaches.contains(tache)) {
                ListeTaches.remove(tache);
            }
        }
        

    }

    
    




