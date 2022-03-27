package exam0314SBADRE;

import java.util.Scanner;

public class PruebaExamen {
	static Examen prueba = new Examen();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean salir=false;
		System.out.println("Nombre   : "+Examen.nombre);
		System.out.println("Apellido : "+Examen.apellido);
		System.out.println("DNI      : "+Examen.DNI);
		System.out.println("Mail     : "+Examen.mail+"\n");
		
		System.out.println("> PRESIONE 1 PARA IMPRIMIR NOMBRE Y APELLIDO VERTICAL");
		System.out.println("> PRESIONE 2 PARA CONTAR PALABRAS");
		System.out.println("> PRESIONE 3 PARA VERIFICAR TU DNI");
		System.out.println("> PRESIONE 0 PARA SALIR");
		while(!salir) {
		int option =sc.nextInt();
		
		switch (option) {
		 
		case 1 : Examen.imprimeVertical(Examen.nombre+" "+Examen.apellido);break;
		        
		case 2 : if (Examen.nombre.contains(" ")) {
			
			     System.out.println("El nombre es compuesto\n");
		        }   
		System.out.print("Número de palabras: 2");Examen.cuentaPalabras(Examen.nombre);break;
		        
		case 3 : if(Examen.generaClave(Examen.DNI)==true) {
			    System.out.println("Coincide");
		}else {System.out.println("No coincide");}break;
		
		case 0 :System.out.println("ADIOS!");
		        salir=true;
		}}

	}

}
