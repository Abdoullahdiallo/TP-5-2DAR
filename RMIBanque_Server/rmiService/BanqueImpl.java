package rmiService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class BanqueImpl  extends UnicastRemoteObject implements IBanque  {
   
	public BanqueImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	public String creerCompte(Compte c) {
		
		return "this"+c;
	}
	public  String getInfoCompte(int code) {
		 return "compte+new Compte(code,0,new Date())+";
	}

}
