package examenAORTIN;

import java.util.*;

public class PruebaExamen {
	static String nombre;
	static String apellido;
	static String dni;
	static String email;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(2>1) {
			System.out.println("1. Introducir datos.\n2. Mostrar datos.");
			int opcion= Integer.parseInt(sc.nextLine());
			
			switch(opcion) {
			case 1:
				System.out.println("Introducir nombre.");
				nombre = sc.nextLine();
				System.out.println("Introducir apellido");
				apellido = sc.nextLine();
				System.out.println("Introducir dni.");
				dni = sc.nextLine();
				System.out.println("Introducir email.");
				email = sc.nextLine();
				break;
			case 2:

				System.out.println("Mostrar por consola el nombre y apellido en vertical (uno al lado del otro)");
				vert(nombre,apellido);
				System.out.println("Mostrar si el nombre es compuesto o simple, en caso de ser un nombre compuesto, debe indicar de cuántas palabras se compone.");
				System.out.println("Comprobar la letra del DNI con el id generado y si coincide mostrar el mensaje “Coincide”, en caso contrario mostrar “No Coincide");
				break;
			}
		}

	}
	
	public static void vert(String n, String a) {
		for(int i=0, j=0;i<100;i++,j++) {
			System.out.println(n.charAt(i)+" "+a.charAt(j));
		}
	}

}
