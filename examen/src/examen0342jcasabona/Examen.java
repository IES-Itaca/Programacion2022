package examen0342jcasabona;

public class Examen {
	public static void main(String[] args) {
		generaClave();
	}
	//Método para comprobar un ID
	public static void generaClave() {
		String mensaje="12345678-J";
		String[] partes = mensaje.split("-");
		String part1 = partes[0];
		String part2 = partes[1];
		boolean correcto=false;
		int numeros=0;
		String cadenas="TWRAGZYFPDXBNJMSQVHLCKE";
		char[] cadena = cadenas.toCharArray();
		numeros=Integer.parseInt(partes[0]);
			
		if(cadena[numeros%23]==partes[1].charAt(0)) {
			correcto=true;
			System.out.println("correcto");
		} else {
			System.out.println("incorrecto");
		}
		
	}
		
	
	
	//Método para contar vocales
	public static void cuentaVocales() {
		String mensaje="HolaaA";
		char[] cadena = mensaje.toCharArray();
		char[] vocalA = new char[] {'a','A'};
		char[] vocalE = new char[] {'e','E'};
		char[] vocalI = new char[] {'i','I'};
		char[] vocalO = new char[] {'o','O'};
		char[] vocalU = new char[] {'u','U'};
		int[] contador = new int [] {0,0,0,0,0};
		for (int i=0;i<cadena.length;i++) {
			for (int j=0;j<vocalA.length;j++) {
				if (cadena[i]==vocalA[j]) {
					contador[0]++;
				}
				if (cadena[i]==vocalE[j]) {
					contador[1]++;
				}
				if (cadena[i]==vocalI[j]) {
					contador[2]++;
				}
				if (cadena[i]==vocalO[j]) {
					contador[3]++;
				}
				if (cadena[i]==vocalU[j]) {
					contador[4]++;
				}
			}
		}
		System.out.println("Número de a: " + contador[0]);
		System.out.println("Número de e: " + contador[1]);
		System.out.println("Número de i: " + contador[2]);
		System.out.println("Número de o: " + contador[3]);
		System.out.println("Número de u: " + contador[4]);
	}
	
	
	//Método para contar palabras
	public static void cuentaPalabras() {
		String mensaje="Hola, que tal";
		char[] cadena = mensaje.toCharArray();
		char espacios=' ';
		int contador=0;
		for (int i=0;i<cadena.length;i++) {
				if (cadena[i]==espacios) {
					contador++;
				}
		}
		contador++;//Esto es para añadir la ulitma palabra, ya que no lleva espacio
		System.out.println("Número de palabras: " + contador);
	}
	
	//Método para imprimir palabras en vertical
	public void imprimeVertical() {
		String mensaje="Aprueba Este Examen";
		char[] cadena = mensaje.toCharArray();
		for (int i=0;i<cadena.length;i++) {
			
		}
	}
	
	//Método para distribuir elementos en un array
	public void distCuatro() {
		
	}
}
