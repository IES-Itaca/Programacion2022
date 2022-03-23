package examenAORTIN;

import java.util.ArrayList;

public class Examen {
	
	static String nombre = "Alejandro";
	static String primerApellido = "Ortín";
	static String dni = "77218158M";
	static String email = "aortin@e-itaca.es";
	
	public static void main(String[] args) {
		contarPalabras("Jul  hu  me ha gfsd sd as ds ");

	}
	

	//Este metodo va a comprobar si la suma de los numeros del dni es igual a la letra del dni
	public static boolean generarClave(String dni) {

		String cadena = dni;
		String letras = "TWRAGZYFPDXBNJMSQVHLCKE";
		String suma = "";
		
		//Este bucle sirve para sumar los numeros
		for(int i=0;i<8;i++) {
			if(cadena.charAt(i)=='1') {
				suma = suma +"1";
			}
			else if(cadena.charAt(i)=='2') {
				suma = suma +"2";
			}
			
			else if(cadena.charAt(i)=='3') {
				suma = suma +"3";
			}
			else if(cadena.charAt(i)=='4') {
				suma = suma +"4";
			}
			else if(cadena.charAt(i)=='5') {
				suma = suma +"5";
			}
			else if(cadena.charAt(i)=='6') {
				suma = suma +"6";
			}
			else if(cadena.charAt(i)=='7') {
				suma = suma +"7";
			}
			else if(cadena.charAt(i)=='8') {
				suma = suma +"8";
			}
			else if(cadena.charAt(i)=='9') {
				suma = suma +"9";
			}

		}
		int modulo = Integer.parseInt(suma)%23;
		
		//Con el modulo se saca la letra en ese indice y se compara con la letra del dni
		if(letras.charAt(modulo)==cadena.charAt(8)) {
			System.out.print(true);
			return true;
		}else {
			System.out.println(false);
			return false;
		}

	}
	
	//Este metodo sirve para contar las vocales de una palabra o frase
	public static void cuentaVocales(String palabra) {
		String texto = palabra;
		int[] numeros = new int[5];
		int a= 0;
		int e=0;
		int i=0;
		int o=0;
		int u = 0;
		
		for(int j=0; j<texto.length();j++) {
			if(texto.charAt(j)=='a') {
				a = a +1;
			}
			else if(texto.charAt(j)=='e') {
				e = e +1;
			}
			
			else if(texto.charAt(j)=='i') {
				i = i +1;
			}
			else if(texto.charAt(j)=='o') {
				o = o +1;
			}
			else if(texto.charAt(j)=='u') {
				u = u +1;
			}
		}
		numeros[0]=a;
		numeros[1]=e;
		numeros[2]=i;
		numeros[3]=o;
		numeros[4]=u;
		
		String letras = "aeiou";
		for(int n=0, l=0;n<numeros.length;n++,l++) {
			System.out.println("El número de "+letras.charAt(l)+" es "+ numeros[n]);
		}
		
	}
	
	public static void imprimeVertical(String texto) {
		String txt = texto;
		System.out.println(txt.split(" "));
		
	}
	
	//Método para devolver un ArrayList de arrays de tipo float
	public static ArrayList<float[]> distCuatro(float[] array) {
		ArrayList<float[]> lista = new ArrayList<>();
		float[] array2 = new float[4];
		for(int i = 0; i<array.length;i++) {
			array2[i]=array[i];
			if(i==4) {
				lista.add(array2);
			}
		}
		return lista;
	}
	
	//Metodo contar palabras
	
	public static void contarPalabras(String t) {
		String texto1;
		String texto = spaceReductor(t);
		if(texto.charAt(texto.length()-1)==' ') {
			texto1=texto;
		}else {
			texto1=texto+" ";
		}
		int palabras=0;
		for(int i = 0;i<texto1.length();i++) {
			if(texto1.charAt(i)==' ') {
				palabras = palabras +1;
			}
		}
		
		
		System.out.println(palabras);
		
	}
	
	/*Si hay más de un espacio entre dos palabras, cambiarlo por un único espacio*/
	
	private static String spaceReductor(String texto) {
		boolean hayEspacio=false;
		String cadena="";
		
		/*
		 * Dentro del bucle se recorrerá el texto. Cuando el caracter es distinto de espacio se unirá a la cadena directamente.
		 * Cuando el caracter es texto, el primero lo únira a la cadena resultante y se indicará que ya se ha encontrado un espacio(hayEspacio=true).
		 * Los siguientes espacios encontrados después de un espacio incorporado a la cadena se obviarán.
		 * Cuando vuelva a aparecerer un caracter distinto de cero, siguiente primer espacio se volverá a unir a la cadena y se repetira lo anterior.
		 * */
		for(int i=0; i<texto.length();i++) {
			if(texto.charAt(i)==' ') {
				if((texto.charAt(i)==' ')&&(hayEspacio==false)) {
					cadena = cadena + texto.charAt(i);
					hayEspacio=true;
				}
			}else {
				cadena = cadena + texto.charAt(i);
				hayEspacio = false;
			}
		}
		return cadena;
	}

	

}
