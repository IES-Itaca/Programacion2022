package exam0314SBADRE;

	import java.util.*;

	public class CafeGratis_Map {
		
		static Scanner sc = new Scanner(System.in);
		static double price= 2; 
		static HashMap<Integer,Double> client = new HashMap<>();
		static int counter = 0;
		
		
		public static void main(String[] args) {
			int id = 0;
		    boolean turnOn= true;
			
		
			while(turnOn)
			{
			
			System.out.println("ENTER YOUR ID");
			id= sc.nextInt();
			client= total(id);
			
			System.out.println("__________________TICKET____________________\n");
			if(counter==4) {
			System.out.println("__________________TICKET____________________\n");
			System.out.println(" Welcome Client N° CL"+id+" you have to pay "+(price*0.75)+"$\n");
			
			}else {
		    System.out.println(" Welcome client N° CL"+id+" you have to pay "+price+"$\n");
		    
			}
			System.out.println(" Your Total is: "+client.get(id)+"$\n");	
			System.out.println(" Consumption N° "+counter);
			System.out.println("____________________________________________\n");
			 if(counter==14) {
					client.remove(id);
				 }}
			
		}
		
		public static HashMap<Integer,Double> total (int id){
			
			Double total=0.0;
			if(!client.containsKey(id)) {
				client.put(id, 0.0);
				counter=0;
			}
			else {
				total=client.get(id);
			}
			
			
			if (!client.containsKey(id)) {
				counter=0;
	      	    client.put(id, price);
	      	    counter++;
	      	  
	        }
			else if (client.containsKey(id)) {
				    counter++;
					if(counter%4==0 && counter!=0 ) {
						client.put(id, total+=(price*0.75));
						
					}else if (counter==14) {
						client.put(id, total=total*0.95);
					}
						else {
					client.put(id, total+=price);
		           
		}
					
					
			
	}//System.out.println("method "+counter);
			return client;
	}
	}

