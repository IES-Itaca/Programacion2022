package exam0314SBADRE;

import java.util.ArrayList;
import java.util.Scanner;

public class CafeGratis {
	
	 int clienteID; // client id
	
	
    public CafeGratis(){
    	
    }
	public CafeGratis(int clienteID) {
		this.clienteID = clienteID;
	}
	public int getClienteID() {
		return clienteID;
	}


	public void setClienteID(int clienteID) {
		this.clienteID = clienteID;
	}


	public static void main(String[] args) {
		double coffeePrice =2; //Coffee price 
		double total=0.0;
		CafeGratis shop = new CafeGratis();
		Scanner sc =new Scanner(System.in);
		
		ArrayList<Integer> listCliente = new ArrayList<>();
		
		
		System.out.println("Introduce the Cliente id" );
	    shop.setClienteID(sc.nextInt());
	    int ID = shop.getClienteID(); // set the id to an int variable
	    
	    if(listCliente.contains(ID)) {
	    	switch(reduction(ID)){
	    	case 5 : coffeePrice=coffeePrice*0.75; // in case consumption equals 5 ; fifth drink 25 off
	    	case 15 : total = (reduction(ID)*coffeePrice) *0.95; // in case its the 15 round the total is 5 % off
	    		
	    	}
	    }
		

	}
 
	
	public static int reduction(int id) {
		int consumptions=0;
		consumptions++;
		
		return consumptions;
		
	}
}
