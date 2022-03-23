package examen0236sbuil;

public class Examen {

	public static void main(String[] args) {
		cuentaVocales("Me cago en la madre que me pario");

	}

	//METODO PARA GENERAR CLAVES
	public boolean generaClave(String a) {
		boolean aa=true;
		//paso la cadena a double
		Double.parseDouble(a);
		//le aplico el mod% 
		
		
		
		
		return aa;
	}
	
	//METODO PARA CONTAR VOCALES
	public static int[] cuentaVocales(String a) {
		
		String texto=a;
		String texto1="";
		
		//convierto la cadena en minusculas
		texto1=texto.toLowerCase();
		
		//variable para dar tamaño al array
		int tamaño=texto1.length();
		
		//creo un array donde voy a guardar los caracteres del texo que recibo
		char[] cadena= new char[tamaño];
		
		//array de enteros donde voy a guardar la cantidad de vocales
		int[] vocales = new int[5];
		
		//paso la cadena caracter a caracter al array
		cadena=texto1.toCharArray();
	
		//variables donde voy a acumular las vocales
				int va=0;
				int ve=0;
				int vi=0;
				int vo=0;
				int vu=0;
		
		//for para recorrer la cadena
		for(int i=0; i<cadena.length;i++) {
			
			if(cadena[i]=='a') {
				va++;
			}
			
			if(cadena[i]=='e') {
				ve++;
			}
			
			if(cadena[i]=='i') {
				vi++;
			}
			
			if(cadena[i]=='o') {
				 vo++;
			}
			
			if(cadena[i]=='u') {
				vu++;
			}
			
		}
		
		//inserto la cantidad de vocales en cada posicion del array
		vocales[0]=va;
		vocales[1]=ve;
		vocales[2]=vi;
		vocales[3]=vo;
		vocales[4]=vu;
		
		//imprimo el array de vocales
		for(int j=0; j<vocales.length;j++) {
			if (j==0) {
				System.out.println("Apariciones de la vocal 'a' = " + vocales[j]);
			}
			
			if (j==1) {
				System.out.println("Apariciones de la vocal 'e' = " +vocales[j]);
			}
			
			if (j==2) {
				System.out.println("Apariciones de la vocal 'i' = " +vocales[j]);
			}
			
			if (j==3) {
				System.out.println("Apariciones de la vocal 'o' = " +vocales[j]);
			}
			
			if (j==4) {
				System.out.println("Apariciones de la vocal 'u' = " +vocales[j]);
			}
			
		}

		return vocales;
		
	}
	
	//METODO PARA CONTAR PALABRAS
	public static int cuentaPalabras(String a ) {
		/*le añado un caracter especial al final.
		ya que voy a contar las palabras a traves de los espacios,
		y al quitar los de detrás se me dejaría de contar la ultima palabra*/
		
		String texto=a +"ã";
		String texto1="";
		String texto2="";
		String texto3="";
		String textoFinal="";
		
		int contador=0;
		//convierto la cadena en minusculas
		texto1=texto.toLowerCase();
		
		//le quito los espacios de delante y de detrás
		texto2=texto1.trim();
		
		//le quito los espacios que haya de más
		textoFinal=texto2.replaceAll("( )+" , " ");
		
		
		//creo un array donde voy a guardar los caracteres del texto
		char [] cadena = new char [1000];
		
		//paso la cadena a un array de caracteres
		cadena=textoFinal.toCharArray();
		//reocorro la cadena y si se encuentra un espacio le sumo uno a un contador
		
		for(int i=0; i<cadena.length;i++) {
			if(cadena[i]==' ') {
				contador++;
			}
			if(cadena[i]=='ã') {
				contador++;
			}
			
		}
		
		System.out.println(contador);
		return contador;
     }
}
	
	//METODO PARA IMPRIMIR PALABRAS EN VERTICAL
	
	





