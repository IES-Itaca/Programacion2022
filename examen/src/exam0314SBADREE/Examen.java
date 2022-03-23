package exam0314SBADREE;
import java.util.ArrayList;
import java.util.Arrays;


public class Examen {
	//finals
    String nombre;
    String primerApellido;
	String DNI ;
    String instituto_mail;
	
	
	public Examen() {
		nombre="badr";
	    primerApellido="serhiri" ;
		DNI="12345678D" ;
	    instituto_mail="mail@mail.com";
	}
	public Examen(String nombre,String primerApellido, String DNI,  String instituto_mail) {
		this.nombre=nombre;
		this.primerApellido=primerApellido;
		this.DNI = DNI;
		this.instituto_mail=instituto_mail;
	}
	
	

	
	public String toString() { // create a toString method to show the details of the object in a string form
		
		return "Examen [nombre=" + nombre + ", primerApellido=" + primerApellido + ", DNI=" + DNI + ", instituto_mail="
				+ instituto_mail + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getInstituto_mail() {
		return instituto_mail;
	}
	public void setInstituto_mail(String instituto_mail) {
		this.instituto_mail = instituto_mail;
	}
	public static void main(String[] args) {
		String d="36985214H";
        System.out.println(generaClave(d));
        String b= "aaauuuiiiiouuu";
        System.out.println(Arrays.toString(cuentaVocales(b)));
        String a = "badre serhiri chems eddine";
        System.out.println(cuentaPalabras(a));
       
	}
	
	
	
	public static boolean generaClave(String cadena) {
		boolean bol = false;
		
		String letters ="TWRAGZYFPDXBNJMSQVHLCKE";
		char [] letterArr = letters.toCharArray(); // array of char string 2
		char [] cadenaArr =cadena.toCharArray();  //  array for string 1
		String cadena2 ="";
		for (int i=0; i<cadena.length()-1;i++){ // take the first 8 characters of the string
			
			cadena2 += cadena.charAt(i); 	//use a string method 
			
		}//System.out.println(Integer.valueOf(cadena2)); // parse it to int
		
		int value =Integer.parseInt(cadena2)%23; // apply modulus
	
			if (letterArr[value] == cadenaArr[8]){ // if the positions are equal return true or false
				bol=true; //System.out.println(bol);
				
			}else {bol=false; }//System.out.println(bol);}
		
	
		return bol;
		
	}
	//a, e, i, o, and u
	public static int[] cuentaVocales (String cadena) {
		int [] vowels = new int [5]; // int array of size 5  for the 5 vowels
		
		//change the string to lower case, so there's no need to worry with capitals
		for (int i=0; i<cadena.length();i++) {  
			switch(cadena.charAt(i)) { // switch when it find the wanted character
			case 'a' : vowels[0] = vowels[0]+1;break; // change the position of the array by incrementing it's current value
			case 'e' : vowels[1] = vowels[1]+1;break;
			case 'i' : vowels[2] = vowels[2]+1;break;
			case 'o' : vowels[3] = vowels[3]+1;break;
			case 'u' : vowels[4] = vowels[4]+1;break;
			}
		}

		
		return vowels;
		
	}
	
	
	
     public static int cuentaPalabras(String cadena) {
    	 int count =0; // counter
    	 //trim the start and ending spaces
    	 String[] cadena2 = cadena.split(" "); //create an array of string and add to it each word split by white space
    	 
    	 for(String i : cadena2) { // for each word increment counter
    		 count++;
    	 }
    	 
    	 
	    return count;
      }

     public static void imprimeVertical(String cadena) {
    	 //this is the hardest method in the exam
 	}
     
     public static ArrayList<float[]> distCuatro(float [] floatArr) {
    	ArrayList<float[]> lista = new ArrayList<float[]>();
    	//go through the float array, then store each for in an array, then add to the list
    	
    	floatArr =  new float[4];  //use this as an auxiliar 
    	// for ()
     
    	
    	lista.add(floatArr);
		return lista;
    	 
     }
}
