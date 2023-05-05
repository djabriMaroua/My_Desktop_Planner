package My_Desktop_planner;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Creneau {
  /*-------------------------------------------------------*/
  // attribus

  private Tache tache;
  private LocalDateTime HeureDebut;
  private LocalDateTime HeureFin;
  private Duration DureeMin;
  private boolean etat; // bloqué ou pas
  private boolean libre;
  // constructor ----------------------------------------------------

  public Creneau(Tache tache, LocalDateTime HeureDebut, LocalDateTime HeureFin, Duration DureeMin, boolean etat) {
    this.tache = tache;
    this.HeureDebut = HeureDebut;
    this.HeureFin = HeureFin;
    this.DureeMin = DureeMin;
    this.etat = etat;
  }

  // -------------------------------------------------------------

  // getters and setters
  public Tache getTache() {
    return tache;
  }

  public void setTache(Tache tache) {
    this.tache = tache;
  }

  public LocalDateTime getHeureDebut() {
    return HeureDebut;
  }

  public void setHeureDebut(LocalDateTime HeureDebut) {
    this.HeureDebut = HeureDebut;
  }

  public LocalDateTime getHeureFin() {
    return HeureFin;
  }

  public void setHeureFin(LocalDateTime HeureFin) {
    this.HeureFin = HeureFin;
  }

  public Duration getDureeMin() {
    return this.DureeMin;
  }

  public void setDureeMin(Duration DureeMin) {
    this.DureeMin = DureeMin;
  }

  public boolean isEtat() {
    return etat;
  }

  public void setEtat(boolean etat) {
    this.etat = etat;
  }

  public Boolean getlibre() {
    return libre;
  }

  public void setlibre(Boolean libre) {
    this.libre = libre;
  }
  /*-------------------------------------------------------*/
  // methods

  public void Planifier(Tache tache) {

  }

  public void plnnifier_creneau(Tache tache) {
    setTache(tache);

  }

  public String Calculer_Duree() {


    Duration duration = Duration.between(this.HeureDebut, this.HeureFin);
    long hours = duration.toHours();
    long minutes = duration.toMinutes() % 60;
    return String.format("%d heures et %d minutes", hours, minutes);
  }

  public void bloquer_creneau() {
    setEtat(Boolean.parseBoolean("false"));
  }

  public int Comparer_duree(String duration) {
    String duration1 = Calculer_Duree();
    return duration1.compareTo(duration);
  }


  public   Creneau[] decomposerCreneau(Tache tache,Creneau creneau) {
    LocalDateTime debut=creneau.HeureDebut; LocalDateTime fin=creneau.HeureFin;
    Duration dureePremierePartie=tache.getDuree();
    // Calcul de la fin de la première partie
    LocalDateTime finPremierePartie = debut.plus(dureePremierePartie);

    // Calcul de la début de la deuxième partie
    LocalDateTime debutDeuxiemePartie = finPremierePartie;

    // Création du tableau avec les débuts et fins des deux parties
    LocalDateTime[] resultats = new LocalDateTime[4];
    resultats[0] = debut;
    resultats[1] = finPremierePartie;
    resultats[2] = debutDeuxiemePartie;
    resultats[3] = fin;
    Creneau creneaux[]=new Creneau[2];
    creneaux[0].HeureDebut=resultats[0];
    creneaux[0].HeureFin=resultats[1];
    creneaux[1].HeureDebut=resultats[3];
    creneaux[1].HeureFin=resultats[4];



    return creneaux;}}