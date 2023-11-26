package rmiClient;

import java.rmi.Naming;
import java.util.Date;


public class BanqueClient {
   public static void main(String[] args) {
	   try {
	   // Recherche de l'objet distant en utilisant le nom "rmi://localhost:1075/HelloObject"
  	 IBanque stub = (IBanque) Naming.lookup("rmi://localhost:2225/ObjectB");
  	 //Appel à methode distant 
  	 Compte c = new Compte(2,1000,new Date());
  	 System.out.println(stub.getInfoCompte(2));
  	 
}catch (Exception e) {
	e.printStackTrace();
	}
}
}