package examen0344VMENDOZA;

import java.util.Scanner;

public class PruebaExamen {
	static Scanner s = new Scanner (System.in);
	static String nombre,apellido,dni,email;
	static void menu() {
		System.out.println("MENÚ");
		System.out.println("-------------------");
		System.out.println("1. Introducir datos");
		System.out.println("2. Mostrar datos");
		switchMenu();
	}
	static void switchMenu() {
		switch(s.nextLine()) {
		case "1": introducir(); break;
		case "2": break;
		default: System.out.println("ERROR, elegir 1 o 2."); switchMenu(); break;
		}
	}
	static void introducir() {
		System.out.println("a. Nombre");
		System.out.println("b. Apellido");
		System.out.println("c. DNI");
		System.out.println("d. Email");
		switchIntroducir();
	}
	static void switchIntroducir() {
		switch(s.nextLine()) {
		case "a": nombre=s.nextLine(); break;
		case "b": apellido=s.nextLine();break;
		case "c": dni=s.nextLine(); break;
		case "d": email=s.nextLine(); break;
		default: System.out.println("ERROR, elegir A, B, C o D."); switchIntroducir(); break;
		}
	}
	static void mostrar() {
		System.out.println("a. Nombre y apellido en vertical");
		System.out.println("b. Compuesto o simple + palabras");
		System.out.println("c. Comprobar DNI");
		switchMostrar();
	}
	static void switchMostrar() {
		switch(s.nextLine()) {
		case "a": nombreYapellido(); break;
		case "b": compuesto(); break;
		case "c": dni(); break;
		default: System.out.println("ERROR, elegir A, B o C"); switchMostrar(); break;
		}
	}
	static void nombreYapellido() {
		int longitud;
		if(nombre.length()<apellido.length()) {
			longitud=nombre.length();
		}else {
			longitud=apellido.length();
		}
		for(int x=0;x<longitud;x++) {
			System.out.println(nombre.charAt(x)+apellido.charAt(x));
		}
	}
	static void compuesto() {
		if(nombre.contains(" ")) {
			System.out.println("Nombre compuesto de " + Examen.cuentaPalabras(nombre) + " palabras.");
		}else {
			System.out.println("Nombre simple.");
		}
	}
	static void dni() {
		if(Examen.generaClave(dni)) {
			System.out.println("Coincide");
		}else {
			System.out.println("No coincide");
		}
	}
}
