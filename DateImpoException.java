package My_Desktop_planner;

// l'utilisateur ne peut pas choisir une date debut de la periode anterieure a la date du jour 
public class DateImpoException extends Exception{

    public DateImpoException(String message) {
        super(message);
    }


    
}
