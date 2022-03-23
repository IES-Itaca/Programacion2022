package examenJVELILLA;

import java.util.Scanner;

public class PruebaExamen {
	
	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	Examen prueba = new Examen();
	String opcion = "";
	System.out.println(Examen.getNombre());
		
	System.out.println("INTRODUCE LOS DATOS");
	System.out.println("a. Introduce nombre");
	System.out.println("b. Introduce apellido");
	System.out.println("c. Introduce DNI");
	System.out.println("d. Introduce mail");
	opcion = entrada.nextLine();
	
	switch(opcion) {
	case "a": break;
	case "b": break;
	case "c": break;
	case "d": break;
	}
	
	System.out.println("MOSTRAR DATOS");
	System.out.println("a. Mostrar por consola el nombre y apellido en vertical (uno al lado del otro)");
	System.out.println("b. Mostrar si el nombre es compuesto o simple, en caso de ser un nombre compuesto, debe indicar de cuántas palabras se compone.");
	System.out.println("c. Comprobar la letra del DNI con el id generado y si coincide mostrar el mensaje “No Coincide”");
	opcion = entrada.nextLine();
	
	switch(opcion) {
	case "a": break;
	case "b": break;
	case "c": break;
	}
	
	}
}
