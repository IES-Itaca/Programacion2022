package exam0314SBADRE;

import java.util.ArrayList;
import java.util.Arrays;

public class Examen {

	final static String nombre="badre chems eddine";
	final static String apellido="serhiri ";
	final static String DNI ="12345678M";
	final static String mail="badre@mail.com";
	
	
	public Examen() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDNI() {
		return DNI;
	}
	
	public String getMail() {
		return mail;
	}
	
	
	
	public static boolean generaClave (String cadena) {
		boolean coincide=false;
		String letters = "TWRAGZYFPDXBNJMSQVHLCKE";
		int numVal = Integer.valueOf(cadena.substring(0, 8));
		int position = numVal%23;
		//System.out.println(position);
		if (cadena.charAt(cadena.length()-1)==letters.charAt(position)) {
			coincide=true;
			//System.out.println(coincide);
		}else {
			coincide=false;
			//System.out.println(coincide);
		}
		
		return coincide;
		
	}
	
	//a, e, i, o, and u.
	
	public static int[] cuentaVocales(String cadena) {
		cadena = cadena.toLowerCase();
		int []counter = new int[5];
		for (int i=0; i<cadena.length();i++) {
		switch(cadena.charAt(i)) {
		  
		case 'a' : counter[0]+=1;break;
		case 'e' : counter[1]+=1;break;
		case 'i' : counter[2]+=1;break;
		case 'o' : counter[3]+=1;break;
		case 'u' : counter[4]+=1;break;
		}
		}
		System.out.println(Arrays.toString(counter));
		return counter;
		
	}
	
	public static int cuentaPalabras (String cadena) {
		int counter=0;
		cadena = cadena.trim().toLowerCase();
		String [] cadenaArr = cadena.split("[^a-zA-z]");
		for(String word : cadenaArr) {
			counter++;
		}
		System.out.println(counter);
		return counter;
		
	}
	
	
	public static String imprimeVertical(String cadena) {
		
			String [] cadenaArr = cadena.split("[^a-zA-z]");
			int wordSize=0;
			
			for (String word : cadenaArr) {
				//wordChar= word.toCharArray();
				if(word.length()>wordSize) 
				   wordSize=word.length();
				    
			}
			
				
		    char [][] vertical = new char[cadenaArr.length][wordSize];
			for(int i =0; i<cadenaArr.length;i++) {
				char[] wordChar= cadenaArr[i].toCharArray();
				for (int j=0;j<wordChar.length;j++ ) {
					
					vertical[i][j]= wordChar[j];
					
				}
			}//System.out.println(Arrays.deepToString(vertical));
			
			for(int k =0; k<wordSize;k++) {
				for (int b= 0 ; b<vertical.length; b++) {
	                 System.out.print(vertical[b][k]+"  ");
				}System.out.println();
			}
			return cadena;
			}
	
	
	public static ArrayList<float []> distCuatro (float[] cuarto){
		
		ArrayList<float[]> floatArr = new ArrayList<>();
		
			floatArr.add(cuarto);
		for(int i =0; i<floatArr.size();i++) {
		System.out.println(Arrays.toString(floatArr.get(i)));
		}
		return floatArr;
		
	}
	public static void main(String[] args) {
		
		String word = "Aprueba este examen";
		float float1[] = {10.10f,30.3f,40.60f,77.50f};
		System.out.println("generarClave Metodo: "+generaClave(DNI));
		System.out.println("\ncuentaVocales Metodo: ");cuentaVocales(apellido);
		System.out.println("\ncuentaPalabras Metodo: ");cuentaPalabras(nombre);
		System.out.println("\nimprimeVertical Metodo: ");imprimeVertical(word);
		System.out.println("\ndistCuatro Metodo: ");distCuatro(float1);
		
	}

}
