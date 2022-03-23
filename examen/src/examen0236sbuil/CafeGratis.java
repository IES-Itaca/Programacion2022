package examen0236sbuil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CafeGratis {
	
	/*LOS CLIENTES SERÁN LAS POSICIONES DE LA LISTA*/
	
	static Scanner sc = new Scanner(System.in);
	
	//consumiciones
	static double cafeLeche=1.30;
	static double te=1.20;
	static double fanta=1.80;
	static double nestea=1.80;
	static double cortado=1.20;
	
	//variable para calcular el toal
	static double total=0;
	//variable que va a mostrar el numero del cliente
	static int cliente=1;
	//variable contador para saber cuando aplicar los descuentos
	static int contador=1;
	//variable contador para saber cuando aplicar el descuento al total
	static int contadorT=1;
	//variable contador para calcular las consumiciones
	static int contadorC=0;
	
	
	
	public static void main(String[] args) {
		
		//lista donde voy a guardar la lista de consumiciones de los clientes
		 ArrayList <Double> consumiciones = new ArrayList <Double>();
		//lista donde voy a guardar las listas de consumiciones
		 ArrayList <List> listaCons = new ArrayList <List> ();
		 
			//boolean para controlar la salida del local
			boolean salidaCafe=true;
			
			while(salidaCafe==true) {
				//muestro las tarifas al cliente
				System.out.println("Cliente Nº" + cliente);
				System.out.println();
				System.out.println("Que sepa que la cuarta consumicion viene con un 25% de decuento");
				System.out.println("Y si llega a 15 consumiciones le haremos un 5% de descuento en el total de la cuenta");
				System.out.println();
				
				
				//formo la cuenta del cliente
				boolean salidaMenu=true;
				while(salidaMenu==true) {
					
					System.out.println("¿Que quiere consumir?");
					System.out.println();
					//le indico al usuario que tendrá descuento en la consumicion
					if(contador==4) {
						System.out.println("|------------------------------------------------------|");
						System.out.println("|A ESTA CONSUMICION SE LE APLICARÁ UN 25% DE DESCUENTO |");
						System.out.println("|------------------------------------------------------|");
						System.out.println();
					}
					
					//aplico el 5% de descuento al total por llegar a las 15 consumiciones
					if(contadorT==15) {
						System.out.println("|--------------------------------------------------------------------------------------------|");
						System.out.println("|HA LLEGADO A 15 CONSUMICIONES, POR LO QUE SE LE VA A APLICAR UN 5% DE DESCUENTO EN EL TOTAL |");
						System.out.println("|--------------------------------------------------------------------------------------------|");
						total=total*0.95;
						//reinicio el contador
						contadorT=1;
					}
					
					//muestro las consumiciones
					System.out.println("1.Cafe con leche.- 1.30");
					System.out.println("2.Cortado.- 1.20");
					System.out.println("3.Té de Limon.- 1.20");
					System.out.println("4.Fanta de Naranja.- 1.80");
					System.out.println("5.Nestea. 1.80");
					System.out.println("6.Me arrepiento, chao.");
					
					int opcion=Integer.parseInt(sc.nextLine());
					
					//switch para la opcion del usuario
					switch (opcion) {
					
						case 1:
							if(contador==4) {
								System.out.println();
								//añado el producto menos el 15%
								System.out.println("Has añadido " + cafeLeche*0.75 + " a tu cuenta");
								consumiciones.add(cafeLeche*0.75);
								total=total+cafeLeche;
								contador=1;
								contadorT++;
								contadorC++;
							}else {
								System.out.println("Has añadido " + cafeLeche + " a tu cuenta");
								//añado el producto a las lista de consumiciones del cliente
								consumiciones.add(cafeLeche);
								total=total+cafeLeche;
								contador++;
								contadorT++;
								contadorC++;
							}
							
							break;
							
						case 2:
							if(contador==4) {
								System.out.println();
								System.out.println("Has añadido " + cortado*0.75 + " a tu cuenta");
								consumiciones.add(cortado*0.75);
								total=total+cortado;
								contador=1;
								contadorT++;
								contadorC++;
							}else {
								System.out.println("Has añadido " + cortado + " a tu cuenta");
								consumiciones.add(cortado);
								total=total+cortado;
								contador++;
								contadorT++;
								contadorC++;
							}
							break;
							
						case 3:
							if(contador==4) {
								System.out.println();
								System.out.println("Has añadido " + te*0.75 + " a tu cuenta");
								consumiciones.add(te*0.75);
								total=total+te;
								contador=1;
								contadorT++;
								contadorC++;
							}else {
								System.out.println("Has añadido " + te + " a tu cuenta");
								consumiciones.add(te);
								total=total+te;
								contador++;
								contadorT++;
								contadorC++;
							}
							break;
							
						case 4:
							if(contador==4) {
								System.out.println();
								System.out.println("Has añadido " + fanta*0.75 + " a tu cuenta");
								consumiciones.add(fanta*0.75);
								total=total+fanta;
								contador=1;
								contadorT++;
								contadorC++;
							}else {
								System.out.println("Has añadido " + fanta + " a tu cuenta");
								consumiciones.add(fanta);
								total=total+fanta;
								contador++;
								contadorT++;
								contadorC++;
							}
							break;
							
						case 5:
							if(contador==4) {
								System.out.println();
								System.out.println("Has añadido " + nestea*0.75 + " a tu cuenta");
								consumiciones.add(nestea*0.75);
								total=total+nestea;
								contador=1;
								contadorT++;
								contadorC++;
							}else {
								System.out.println("Has añadido " + nestea + " a tu cuenta");
								consumiciones.add(nestea);
								total=total+nestea;
								contador++;
								contadorT++;
								contadorC++;
							}
							break;
							
						case 6:
							System.out.println("De acuerdo, no vuelva.");
							salidaMenu=false;
							salidaCafe=false;
							break;
					}
					
					
					if(salidaMenu==true) {
				
						System.out.println("¿Quiere consumir algo más? 1.-SI || 2.-NO");
						int opcion2=Integer.parseInt(sc.nextLine());
						if(opcion2==1) {
							System.out.println("De acuerdo");
							System.out.println();
						}
						if(opcion2==2) {
							System.out.println("De acuerdo, gracias.");
							System.out.println();
							salidaMenu=false;
							cliente++;
							
						}
						
						
					}
					
					
				}
				//añado la lista de consumiciones del cliente en la lista de listas de consumiciones
				listaCons.add(consumiciones);
				System.out.println("Cliente añadido a la lista");
				System.out.println("-------------------------------------------------------------------------------------------------");
				System.out.println();
				//reinicio las variables
				total=0;
				contadorC=0;
				contador=0;
				
			}
			
			System.out.println();
			System.out.println();
			
			System.out.println("IMPRIMO LAS LISTAS");
			
			for(List e: listaCons) {
				System.out.println(e);
			 }
			
			//imprimo el cliente indicado
			System.out.println("De que cliente desea saber el historial");
			int cliente= Integer.parseInt(sc.nextLine());
			
				listaCons.get(cliente-1);
			

	}
	
}




