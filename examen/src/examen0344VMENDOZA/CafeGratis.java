package examen0344VMENDOZA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Comentarios: los menús switch son para que no dé error y poder volver a 
 * llamarlos en caso de introducir algo erróneo
 */

/*
 * Comentarios extra: no he comprobado 
 */

public class CafeGratis {
	static List<Double> cuenta = new ArrayList<Double>();
	static int[] consumiciones=new int[50];
	static double PRECIO=2.25;
	static int lectura, contador;
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("CAFÉ");
		System.out.println("-----------------");
		System.out.println("1. Añadir cliente");
		System.out.println("2. Pedir");	
		System.out.println("3. Ver cuenta");
		switchMenu();
	}
	static void switchMenu() {
		switch(s.nextLine()) {
		case "1": cliente(); break;
		case "2": pedir(); break;
		case "3": cuenta(); break;
		default: System.out.println("Elija 1, 2 o 3"); switchMenu(); break;
		}
	}
	static void cliente() {
		cuenta.add((double) 0);
		consumiciones[contador]=0;
		contador++;
		System.out.println("Su número de cliente es: " + contador);
		switchMenu();
	}
	static void pedir() {
		System.out.println("Introduzca número de cliente");
		lectura=Integer.parseInt(s.nextLine());
		consumiciones[lectura-1]++;
		if(consumiciones[lectura-1]%4==0&&consumiciones[lectura-1]!=0) {
			cuenta.add(lectura-1, cuenta.get(lectura-1)+(PRECIO*75/100));
		}else {
			cuenta.add(lectura-1, cuenta.get(lectura-1)+PRECIO);
		}
		if(consumiciones[lectura-1]==15) {
			cuenta.add(lectura-1,cuenta.get(lectura-1)-(cuenta.get(lectura-1))*5/100);
		}
		switchMenu();
	}
	static void cuenta() {
		System.out.println(cuenta.get(lectura));
		switchMenu();
	}
}
