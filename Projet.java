package My_Desktop_planner;
public class Projet {
    /*-------------------------------------------------------*/
    //attribus 
    private Tache [ ] ListeTaches ; 
    private String nom ; 
    private String Description ; 
    //etat d'avancement 



    //construtor ---------------------------------------------
    public Projet(Tache[] ListeTaches, String nom, String Description, int etatAvancement) {
        this.ListeTaches = ListeTaches;
        this.nom = nom;
        this.Description = Description;
        //this.etatAvancement = etatAvancement;
    } 


    //getters and setters -----------------------------------------
    public Tache[] getListeTaches() {
        return ListeTaches;
    }

    public void setListeTaches(Tache[] ListeTaches) {
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


    }

    
    



}
