package My_Desktop_planner;

import java.util.ArrayList;
import java.util.Collections;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

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
        Creneau [] cr= new Creneau[2];
        this.classer_taches();
        for (int i = 0; i < this.mes_creneau.size(); i++) {
            Creneau creneau = this.mes_creneau.get(i);
            Tache tache = this.mes_taches.get(i);
            Duration duree1 = Duration.parse(creneau.Calculer_Duree());
           if (duree1.compareTo(this.mes_creneau.get(i).getDureeMin())>0)
           {
               cr= this.mes_creneau.get(i).decomposerCreneau(tache,creneau);//decomposition du creneau
               Duration duree2 = Duration.parse(cr[1].Calculer_Duree());
               if (duree2.compareTo(this.mes_creneau.get(i).getDureeMin())>0)
               {
                   this.mes_creneau.add(i,cr[0]);
                   this.mes_creneau.add(i+1,cr[1]);
                   creneau = this.mes_creneau.get(i);
                   creneau.Planifier(tache);
               }
               else
               {
                   creneau.Planifier(tache);//le creneau sera allouè entierement à la tache
               }
           }

              }
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
    public void planifier_jour_mannu() {
        //affichages des creneau
        for (int i = 0; i < this.mes_taches.size(); i++) {
            System.out.println("la tache " + i + " est :" + this.mes_taches.get(i));

            System.out.println("Choisisez le numero de creneau dont vous voulez associe la tache");
            Scanner scanner = new Scanner(System.in);
            Creneau[] cr = new Creneau[2];
            int num_creneau = scanner.nextInt();
            Creneau creneau = this.mes_creneau.get(i);
            Tache tache = this.mes_taches.get(i);
            Duration duree1 = Duration.parse(creneau.Calculer_Duree());
            if (duree1.compareTo(this.mes_creneau.get(i).getDureeMin()) > 0) {

                this.mes_creneau.get(i).decomposerCreneau(tache, creneau);//decomposition du creneau
                Duration duree2 = Duration.parse(cr[1].Calculer_Duree());
                if (duree2.compareTo(this.mes_creneau.get(i).getDureeMin()) > 0) {
                    this.mes_creneau.add(i, cr[0]);
                    this.mes_creneau.add(i + 1, cr[1]);
                    creneau = this.mes_creneau.get(i);
                    creneau.Planifier(tache);
                } else {
                    creneau.Planifier(tache);//le creneau sera allouè entierement à la tache
                }

            }
        }
    }}
