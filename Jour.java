package My_Desktop_planner;

import java.util.ArrayList;
import java.util.Collections;
public class Jour {
    private ArrayList<Creneau> mes_creneau;
    private ArrayList<Tache> mes_taches;
    private int nb_tache_prevue;
    private int nb_tache_min;
    public int getNb_tache_min() {
        return nb_tache_min;
    }
    public void setNb_tache_min(int nb_tache_min) {
        this.nb_tache_min = nb_tache_min;
    }
    private int nb_tache_realiser;
    public int getNb_tache_realiser() {
        return nb_tache_realiser;
    }
    public void setNb_tache_realiser(int nb_tache_realiser) {
        this.nb_tache_realiser = nb_tache_realiser;
    }
    private float redement;
    public float getRedement() {
        return redement;
    }
    public void setRedement(float redement) {
        this.redement = redement;
    }
    //ArrayList<Tache> mes_tache = new ArrayList<Tache>();
    public void calculer_rendement()
    {
        this.redement=nb_tache_realiser/nb_tache_prevue;
    }
    public void supp_tache(Tache tache)
    {
        mes_creneau.remove(tache);
    }
    public void planifier_jour_auto()
    {
        this.classer_taches();
        for (int i = 0; i < this.mes_creneau.size(); i++) {
            Creneau creneau = this.mes_creneau.get(i);
            Tache tache = this.mes_taches.get(i);
            creneau.Planifier(tache); // on appelle la méthode "planifier" de chaque créneau en y associant la tâche correspondante
        }
    }
    public void encourager_user()
    {

    }
    public void classer_taches()
    {
        // Tri des éléments en fonction de leur priorité
        Collections.sort(this.mes_taches, (e1, e2) -> {
            if (e1.getPriorite().equals(e2.getPriorite())) {
                return 0;
            } else if (e1.getPriorite().equals("High")) {
                return -1;
            } else if (e2.getPriorite().equals("High")) {
                return 1;
            } else if (e1.getPriorite().equals("Medium")) {
                return -1;
            } else if (e2.getPriorite().equals("Medium")) {
                return 1;
            } else if (e1.getPriorite().equals("Low")) {
                return -1;
            } else {
                return 1;
            }
        });
    }
    public void planifier_jour_mannu()
    {

        for (int i = 0; i < this.mes_creneau.size(); i++) {
            Creneau creneau = this.mes_creneau.get(i);
            Tache tache = this.mes_taches.get(i);

            creneau.Planifier(tache); // on appelle la méthode "planifier" de chaque créneau en y associant la tâche correspondante
        }
    }
}
