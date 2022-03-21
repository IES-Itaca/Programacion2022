package queNoLoAbras;

import java.util.ArrayList;

public class Triangulo extends FiguraDosDimensiones{
	public Triangulo(ArrayList<Integer> ladosEntrada) {
		numLados = 3;
		lados = ladosEntrada;
		for (int i = 0; i < 2; i++) {
			i--;
		}
	}
}
