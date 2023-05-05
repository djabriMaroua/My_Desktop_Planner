package My_Desktop_planner;
import java.time.Duration;
import java.util.Calendar;

public   class Tache {
 private String nom;
 public Tache(String nom, Duration duree, String priorite, Calendar datelimite, String couleur, String etat,
        int periodicite) {
    this.nom = nom;
    this.duree = duree;
    this.priorite = priorite;
    this.datelimite = datelimite;
    this.couleur = couleur;
    this.etat = etat;
    this.periodicite = periodicite;
}
public String getNom() {
    return nom;
}
public void setNom(String nom) {
    this.nom = nom;
}
private Duration duree;
  public Duration getDuree() {
    return this.duree ;
}
public void setDuree(Duration duree) {
    this.duree = duree;
}
private String priorite ;
 public String getPriorite() {
    return priorite;
}
public void setPriorite(String priorite) {
    this.priorite = priorite;
}
private Calendar datelimite;
public Calendar getDatelimite() {
    return datelimite;
}
public void setDatelimite(Calendar datelimite) {
    this.datelimite = datelimite;
}
private String  couleur;
public String getCouleur() {
    return couleur;
}
public void setCouleur(String couleur) {
    this.couleur = couleur;
}
private String etat;
public String getEtat() {
    return etat;
}
public void setEtat(String etat) {
    this.etat = etat;
}
private int  periodicite ;
public int getPeriodicite() {
    return periodicite;
}
public void setPeriodicite(int periodicite) {
    this.periodicite = periodicite;
}
 


}
