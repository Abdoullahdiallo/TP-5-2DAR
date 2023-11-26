package metier;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class Compte extends UnicastRemoteObject {
   public int code ; 
   public double solde;
   private Date date;
   // Constructeur avec paramètres pour initialiser les variables membres
   public Compte(int code , double solde , Date date) throws RemoteException  {

       this.code=code;
       this.solde=solde;
       this.date=date;
   }
   // Constructeur par défaut nécessaire pour la sérialisation XML
   public Compte() throws RemoteException {
   }
 //Affichage 
   public String Affiche() throws RemoteException {
       return "code : "+this.code+ "solde : "+this.solde+" date cration " +this.date;
   }
}


