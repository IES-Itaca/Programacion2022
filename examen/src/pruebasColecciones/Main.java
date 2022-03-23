package pruebasColecciones;

import java.util.*;
//import java.util.TreeMap;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	HashMap<String , Integer>  listaPalabras = new HashMap<String , Integer>();
	
	//System.out.println("introduce la frase");
	//String frase = sc.nextLine();
	String frase = "Esto es una es una es prueba";
	String frase2 = frase.toLowerCase();
	String[] palabras = frase2.split(" ");
	System.out.println(palabras.length);
	
	//recorrer el array de palabras
	listaPalabras.put(palabras[0], 1); 
	int contador=0;
	for (String a : palabras) {
		if(!listaPalabras.containsKey(a)){
			listaPalabras.put(a,1);
		}else {
			
			//contador = listaPalabras.get(palabras[i]+1);
			listaPalabras.put(a, listaPalabras.get(a)+1);
		}

	}System.out.println(listaPalabras);
	
	String[] claves = listaPalabras.keySet().toArray(new String[100]);
	Integer[] valores = listaPalabras.values().toArray(new Integer[100]);
	//ordenar los arrays claves orden alfabetico
	Arrays.sort(claves);
	
	//ordenar los valores orden creciente
	Arrays.sort(valores);
	System.out.println(claves.length);
	System.out.println(valores.length);
	System.out.println(valores);
	
;	}
}
