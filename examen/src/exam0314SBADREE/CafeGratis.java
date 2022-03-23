package exam0314SBADREE;
import java.util.*;
public class CafeGratis {



	
		static Scanner sc = new Scanner(System.in);
		static List<Integer> clients = new ArrayList<>();
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
			List<Double> reduc = new ArrayList<>(); // array list to count the consumption
			CafeGratis shop = new CafeGratis(); // object 
			double total = 0; // the total amount paid
			double price = 2; // price of one coffee
			boolean turnOn = true; 
		
			System.out.println("WELCOME TO COFFE GRATIS APP");
			System.out.println("> TYPE 1 TO ENTER ");
			System.out.println("> TYPE 2 TO QUIT ");
			
			int option=sc.nextInt();
			
	        switch (option) {
			
	      case 1 :
		   
			 while(turnOn) {
			 
			 System.out.println("\nTYPE YOUR ID");
			 shop.setClienteID(sc.nextInt());
			 int id = shop.getClienteID(); 
			 	
			 if (clients.contains(id)){
				
				     price=2;
				     total+=price; // increment total by the value of price
				     System.out.println("Client "+shop.clienteID+" Consumption Total : "+total+"$\n");
				     reduc.add(total);
				     System.out.println("Number of drinks: "+reduc.size()+"\n");
				     
				      if (reduc.size()==5 ) {
				    	  System.out.println("\n Congrats your 5th coffee is 25% off\n");
				    	  total=total-price;
					      price= price*0.75;
					      total+=price;
					      //price=2;
					      System.out.println("YOU HAVE TO PAY: "+ price+"$\n");
			          }else if (reduc.size()==14) {
			        	  System.out.println("IT'S YOUR 15TH COFFEE YOU GET 5% OFF ON THE TOTAL\n");
			        	  total=total*0.95;
			        	  System.out.println("TOTAL TO PAY IS : " +total);
			        	  reduc.clear();
			        	  total=0;}
				          
				          
			    }else {
			            clients.add(id);
				        System.out.println("YOU HAVE TO PAY: "+ price+"$\n");
			       	    total+=price;
				        reduc.add(total);
				           }
			 
			       System.out.println("Clients IDs : "+clients); // to see the  clients IDs
		               }
			 
	        case 2 :     turnOn=false; 
			 
			}
		
		}
	}


