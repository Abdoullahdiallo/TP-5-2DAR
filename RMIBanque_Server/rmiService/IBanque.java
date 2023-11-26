package rmiService;

import java.rmi.Remote;

public interface IBanque extends Remote  {
	
	public String creerCompte(Compte c);
	public  String getInfoCompte(int code);
}
