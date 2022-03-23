package examenAORTINcorreccion;

import java.util.ArrayList;
import java.util.Scanner;

public class Examen {
	
	final String nombre="Alejandro";
	final String apellido = "Ortín";
	final String dni = "";
	final String email = "";
	
	public static void main(String[] args) {
		

	}
	public static boolean generaClave(String s) {
		 String texto = s;
		 String letras = "TWRAGZYFPDXBNJMSQVHLCKE";
		 int num = Integer.parseInt(texto.substring(0, 8));
		 
		 if(letras.charAt(num%23)==texto.charAt(9)) {
			 return true;
		 }else {
			 return false;
		 }
		 
	 }
	
	public static int[] cuentaVocales(String s) {
		int[] array = new int[5];
		return array;
	}
	
	
	
	
}
