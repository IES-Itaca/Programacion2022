package examen0344VMENDOZA;

import java.util.ArrayList;
import java.util.List;

public class Examen {
	
	static String NOMBRE="Victor",APELLIDO="Mendoza",DNI="17764289D",MAIL="0344vmendoza@e-itaca.es";
	
	static float[] hola = new float[]{(float) 1.2, (float) 2.3, (float) 3.4};


	public static void main(String[] args) {
		System.out.println(generaClave(DNI));
		System.out.println(cuentaVocales(APELLIDO));
		System.out.println(cuentaPalabras("hola que tal"));
		imprimeVertical("hola que tal");
		System.out.println(distCuatro(hola));
		
	}
	static boolean generaClave(String c) {
		String CADENA="TWRAGZYFPDXBNJMSQVHLCKE";
		int numero=Integer.parseInt(c.substring(0,7));
		numero=numero%23;
		if(c.charAt(8)==CADENA.charAt(numero)) {
			return true;
		}else {
			return false;
		}
	}
	static int[] cuentaVocales(String c) {
		int[] contador = new int[5];
		for(int x=0;x<5;x++) {
			contador[x]=0;
		}
		for(int x=0;x<c.length();x++) {
			switch(c.charAt(x)) {
			case 'a': contador[0]++; break;
			case 'e': contador[1]++; break;
			case 'i': contador[2]++; break;
			case 'o': contador[3]++; break;
			case 'u': contador[4]++; break;
			}
			
		}
		for(int y=0;y<4;y++) {
			System.out.println(contador[y]);
		}
		
		
		return contador;
	}
	static int cuentaPalabras(String c) {
		int numero=1;
		c=acortar(c);
		for(int x=0;x<c.length();x++) {
			if(c.charAt(x)==' ') {
				numero++;
			}
		}
		return numero;
	}
	static void imprimeVertical(String c) {
		List<String> palabras = new ArrayList<String>();
		int numero=0;
		int longitud=0;
		int contador=1;
		for(int x=0;x<c.length();x++) {
			if(c.charAt(x)==' ') {
				palabras.add(c.substring(numero,x));
				contador++;
				if(numero-x>longitud) {
					longitud=numero-x;
				}
				numero=x;
			}
		}
		for(int x=0;x<longitud;x++) {
			for(int y=0;y<contador;y++) {
				if(palabras.get(contador-1).charAt(x)!=-1) {
					System.out.print(palabras.get(contador-1).charAt(x) + "  ");
				}else {
					System.out.print("   ");
				}
				
			}
			System.out.println("");
		}
		
	}
	static ArrayList<Float[]> distCuatro(float[] f) {
		ArrayList<Float[]> lista = new ArrayList<Float[]>();
		Float[] mantener = new Float[4];
		for(int x=0;x<f.length;x++) {
			if(x%4==0) {
				
				for(int y=x;y<+4;y++) {
					for(int z=0;z<4;z++) {
						mantener[z]=f[y];
					}
				}
				lista.add(mantener);
			}
		}
		return lista;
	}
	static String acortar(String texto){
        int sub=0;
        String resultado="";
        for(int x=0;x<texto.length();x++){
            if(texto.charAt(x)==' '){
                resultado=resultado+texto.substring(sub,x);
                resultado=resultado.trim();
                sub=x;
            }
            if(x==texto.length()-1){
                resultado=resultado+texto.substring(sub);
            }
        }
        return resultado;
    }
}
