package queNoLoAbras;

import java.util.ArrayList;

public class FiguraDosDimensiones {
	int numLados;
	ArrayList<Integer> lados = new ArrayList<>();
	
	public void mostrarLados() {
		for(int i=0; i < lados.size(); i++) {
			System.out.println("Lado nº " + (i+1) + " mide: "+ lados.get(i) +" cm");
		}
	}
}
