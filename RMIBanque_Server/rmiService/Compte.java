package rmiService;

import java.util.Date;

public class Compte {
   public int code ; 
   public double solde;
   private Date date;
   // Constructeur avec paramètres pour initialiser les variables membres
   public Compte(int code , double solde , Date date)  {

       this.code=code;
       this.solde=solde;
       this.date=date;
   }
   // Constructeur par défaut nécessaire pour la sérialisation XML
   public Compte()  {
   }
 //Affichage 
   public String toString() {
       return "code : "+this.code+ "solde : "+this.solde+" date cration " +this.date;
   }
}


