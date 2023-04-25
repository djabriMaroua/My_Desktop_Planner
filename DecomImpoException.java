package My_Desktop_planner;
// quant le temp libre restant etant inferieur a la duree minimale ,
// la decomposition est impossible et l'utilisateur aura un message " decomposition impossible"



public class DecomImpoException extends Exception {
    public DecomImpoException (String message) {
        super(message);
    }
    
}
