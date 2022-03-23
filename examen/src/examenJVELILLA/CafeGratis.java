package examenJVELILLA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CafeGratis {

	public static void main(String[] args) {
	//Una cafetería tiene una promoción en la que cada cuatro consumiciones, al cliente se le hace un descuento
	//del 25% en la siguiente consumición. Cada 15 consumiciones se le hace un descuento del 5% del total que ha 
	//gastado en las consumiciones.
	int veces = 1;
	int cambiarUsuario = 0;
	double precio = 1.00;
	int[] idUsuario = new int[100];
	double[] consumicion = new double[100];
	Scanner entrada = new Scanner(System.in);
	//ArrayList<Float[]> listaCompras = new ArrayList<Float[]>();
	do {
	System.out.println("Cual es el nº del cliente");
	int posicion = Integer.parseInt(entrada.nextLine());
	
	idUsuario[posicion] += veces;
	
	if(idUsuario[posicion] % 4==0) {
									System.out.println("descuento del 25% en la siguiente consumición");
									consumicion[posicion] += precio;
									precio = precio*0.95;
	}else if(idUsuario[posicion] % 15==0) {
		
		precio = precio - consumicion[posicion]*0.05;
		consumicion[posicion] += precio;
		}else {

	consumicion[posicion] += precio;
	precio = 1.00;
		}
	
	System.out.println(precio);
	System.out.println(idUsuario[posicion]);
	System.out.println(consumicion[posicion]);
	
	System.out.println("Deseas tomar otro");
	System.out.println("1- SI");
	System.out.println("2- NO");
	cambiarUsuario = Integer.parseInt(entrada.nextLine());
	
	}while(cambiarUsuario==1);
	
	}
	}

