package examenAORTINcorreccion;

import java.util.ArrayList;
import java.util.Scanner;

public class CafeGratis {
	
	// Una cafeter�a tiene una promoci�n en la que cada cuatro consumiciones, al
	// cliente se le hace un descuento del 25% en la siguiente consumici�n. Cada 15
	// consumiciones se le hace un descuento del 5% del total que ha gastado en las
	// consumiciones

	/*Men� para introducir consumiciones
	 * id cliente
	 * importe
	 * */
	
	public static void main(String[] args) {
		
		//Los id's de los clientes empezar�n en 0 y continuar�n de uno en uno.
		
		Scanner sc = new Scanner(System.in);
		
		double[] totalPrecio = new double[50];
		
		int[] totalConsumiciones = new int[50];
		
		double precio = 1.50;
		
		while(true) {
			System.out.println("�C�al es su id?");
			int id = Integer.parseInt(sc.nextLine());
			
			if((totalConsumiciones[id]%4==0)&&(totalConsumiciones[id]>0)) {
				precio = precio*0.75;
				
			}else if((totalConsumiciones[id]%15==0)&&(totalConsumiciones[id]>0)) {
				precio = precio - totalPrecio[id]*0.05;
			}else {
				precio = 1.50;
			}
			totalPrecio[id] += precio;
			totalConsumiciones[id] +=1;
			System.out.println("El cliente con id: "+id+
					" tiene un total de "+totalConsumiciones[id]
							+" y el precio acumulado es de "+totalPrecio[id]);
		}
		
		
	}
	
	
	
}
