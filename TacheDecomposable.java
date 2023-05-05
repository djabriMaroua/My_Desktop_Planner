package My_Desktop_planner;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;

public class TacheDecomposable extends Tache {


    public TacheDecomposable(String nom, Duration duree, String priorite, Calendar datelimite, String couleur, String etat, int periodicite) {
        super(nom, true, duree, priorite, datelimite, couleur, etat, periodicite);
    }

    private ArrayList<Tache> sous_taches;
    public ArrayList<Tache> decomposer_tache()
    {
        return null;


    }

}
