package examenJVELILLA;

public class Examen {
	
	String nombre;
	String apellido;
	String dni;
	String mail;

	//generaClave()
	//cuentaVocales()
	//cuentaPalabras()
	//imprimeVertical()
	//distCuatro()
	
	public Examen(){
		this.nombre = "Juan Alberto";
		this.apellido = "Velilla Mimbrera";
		this.dni = "18169139J";
		this.mail = "0223jvelilla@e-itaca.es";
	}

	//metodo para mirar el DNI
	public boolean generaClave(String dni) {
		
		String numeros="";
		boolean clave=false;
		char[] cadena1 = new char[dni.length()];
		char[] cadena2 = new char[23];
		char letra='T';
		int numDNI;
		String cadenaComparar="TWRAGZYFPDXBNJMSQVHLCKE";
		
		
		//método que pasa un String a un array de carácteres
		cadena1=dni.toCharArray();
		
		//for para sacar los 8 numeros a una cadena
		for(int i=0;i<cadena1.length;i++) {
			
			if(i!=8) {
			numeros=numeros + cadena1[i];
			}
			
		}
		
		//obtengo el numero y lo paso a char
		numDNI=(Integer.parseInt(numeros))%23;
		letra = (char) numDNI;
		
		cadena2=cadenaComparar.toCharArray();
		
		//for para comprobar si el caracter esta dentro de la cadena
		for(int y=0;y<cadena2.length;y++) {
			
		if(cadena2[y]==letra) {
			clave=true;
		}
			}

	return clave;
		
	}
	
	//metodo para contar las vocales
	public int[] cuentaVocales(String mensaje) {
		
		//variables
		int[] vocalesTotales= new int[5];
		
		//separo la cadena y meto caracter a caracter en un array
		char[] cadena = mensaje.toCharArray();
		
	    for (int i = 0; i < cadena.length; i++) {
	        switch(cadena[i]) {
	        case 'a': vocalesTotales[0]=vocalesTotales[0]+1;break;
	        case 'e': vocalesTotales[1]=vocalesTotales[1]+1;break;
	        case 'i': vocalesTotales[2]=vocalesTotales[2]+1;break;
	        case 'o': vocalesTotales[3]=vocalesTotales[3]+1;break;
	        case 'u': vocalesTotales[4]=vocalesTotales[4]+1;break;    
	        
	        }
	       
	    }
	    return vocalesTotales;
	}

		//metodo para contar palabras
		public int cuentaPalabras(String cadena) {
			
			//variables
			int total=0;
			String mensajeDevolver="";
			int tamaño = cadena.length();
			char caracter;
					
					for (int i = 0; i < tamaño; i++) {
			            
						caracter = cadena.charAt(i);
			            
			            //sí encuentra un espacio en blanco entrará en el "if" y mirará si hay más espcios contiguos
			            if (caracter != ' ') {
			            	total=total+1;
			            }
			            
			        }		


			return total;
				
		}
		
		//metodo para imprimir la cadena en vertical
		public void imprimeVertical(String cadena) {
			
			
			
		}

		public String getNombre() {
			return nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public String getDni() {
			return dni;
		}

		public String getMail() {
			return mail;
		}
}
