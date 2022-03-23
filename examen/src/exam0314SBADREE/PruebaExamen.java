package exam0314SBADREE;

import java.util.Scanner;

public class PruebaExamen {
    static Scanner sc = new Scanner (System.in);
    
    
    
	public static void main(String[] args) {
		Examen person = new Examen();    
		boolean turnOff = false;
		while(!turnOff) {
		System.out.println("MAKE SURE YOU DON'T SKIP STEPS ONE TO REGISTER DATA FIRST\n ");
		
		System.out.println("> Type 1 to introduce data ");
		System.out.println("> Type 2 to for vertical view ");
		System.out.println("> Type 3 count words in compound Strings ");
		System.out.println("> Type 4 for the key generating ");
		System.out.println("> Type 0 to close\n");
		
		int option = Integer.parseInt(sc.nextLine());
		
		
        
		switch(option) {
		   
		case 1 :  
		          System.out.println("Type your first name:");
		          person.setNombre(sc.nextLine()); 
		
		          System.out.println("Type your last name :");
		          person.setPrimerApellido(sc.nextLine());
		
		          System.out.println("Type your DNI:");
		          person.setDNI(sc.nextLine());
		
		          System.out.println("Type your mail:");
		          person.setInstituto_mail(sc.nextLine());break;
		
		          //System.out.println(person.toString());// show the person details
		case 2 : 
			           break;
			
		case 3 : if (person.nombre.contains(" ")) {
			        System.out.println("the name :" +person.nombre);
			        System.out.println("the name in complex");
			        int numero = Examen.cuentaPalabras(person.nombre); // call the cuentaPalabras method from the Examen class
			        System.out.println("The number of words: " +numero+"\n");}break;
			      
	   case 4 :  boolean dniCheck = Examen.generaClave(person.DNI); //  call the generaClave method 
	             if (dniCheck == true) {
	            	 System.out.println("Coincide");
	             }else {System.out.println("no Coincide");}break;
	             
	   case 0 : turnOff = true;          //option??
			
		}
		}
		
	}

}
