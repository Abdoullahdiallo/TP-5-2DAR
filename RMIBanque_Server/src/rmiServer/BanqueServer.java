package rmiServer;


import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import rmiService.BanqueImpl;

public class BanqueServer {
    public static void main(String[] args) {
    	try {
    		// Création du registre RMI sur le port 1075
    	LocateRegistry.createRegistry(1000);
    	//creation d'une instance de Banquelmpl
    	BanqueImpl B1 = new BanqueImpl();
        System.out.println(B1.toString());
        // Enregistrement de l'objet BanqueImpl avec le nom "rmi://localhost:1075/HelloObject"
        Naming.rebind("rmi://localhost:1000/ObjectB",B1);
        	
	}catch (Exception e) {
		e.printStackTrace();
		
	}
}
}