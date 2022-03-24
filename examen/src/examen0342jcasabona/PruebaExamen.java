package examen0342jcasabona;

public class PruebaExamen {
	static String nombre="José Ángel";
	static String apellido="Casabona";
	static String DNI = "73445114-L";
	static String mail = "0342jcasabona@e-itaca.es";
	
	public static void main(String[] args) {
		nombreApellido();
		nombreCompuesto(nombre);
		letraDNI(DNI);
	}
	
	//Mostrar por consola el nombre y apellido en vertical (uno al lado del otro).
	public static void nombreApellido() {
		
	}
	
	//Mostrar si el nombre es compuesto o simple, en caso de ser un nombre
	//compuesto, debe indicar de cuántas palabras se compone.
	public static void nombreCompuesto(String nombre) {
		char[] cadena = nombre.toCharArray();
		char espacios=' ';
		int contador=0;
		for (int i=0;i<cadena.length;i++) {
				if (cadena[i]==espacios) {
					contador++;
				}
		}
		contador++;//Esto es para añadir la ulitma palabra, ya que no lleva espacio
		if (contador>1) {
			System.out.println("Nombre compuesto por " + contador + " palabras.");
		}else{
			System.out.println("Nombre simple.");
		}
	}
	
	//Comprobar la letra del DNI con el id generado y si coincide mostrar el
	//mensaje “Coincide”, en caso contrario mostrar “No Coincide”
	public static void letraDNI(String DNI) {
		String[] partes = DNI.split("-");
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
}
