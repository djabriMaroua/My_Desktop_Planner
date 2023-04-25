package My_Desktop_planner;

public class Creneau {
  /*-------------------------------------------------------*/
  // attribus

  private Tache tache;
  private double HeureDebut;
  private double HeureFin;
  private Double DureeMin;
  private boolean etat; // bloqué ou pas

  // constructor ----------------------------------------------------

  public Creneau(Tache tache, double HeureDebut, double HeureFin, Double DureeMin, boolean etat) {
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

  public double getHeureDebut() {
    return HeureDebut;
  }

  public void setHeureDebut(double HeureDebut) {
    this.HeureDebut = HeureDebut;
  }

  public double getHeureFin() {
    return HeureFin;
  }

  public void setHeureFin(double HeureFin) {
    this.HeureFin = HeureFin;
  }

  public Double getDureeMin() {
    return DureeMin;
  }

  public void setDureeMin(Double DureeMin) {
    this.DureeMin = DureeMin;
  }

  public boolean isEtat() {
    return etat;
  }

  public void setEtat(boolean etat) {
    this.etat = etat;
  }

  /*-------------------------------------------------------*/
  // methods

  public void Planifier(Tache tache) {

  }

}
