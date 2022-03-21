package queNoLoAbras;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class LoAbriste {
	public static void main(String[] args) throws IOException {
		File f1 = new File("src/ladosTriangulo.txt");
		FileWriter fw1 = new FileWriter(f1);
		BufferedWriter bw1 = new BufferedWriter(fw1);
		FileReader fr1 = new FileReader(f1);
		BufferedReader br1 = new BufferedReader(fr1);
		
		ArrayList<Integer> ladosTriangulo = new ArrayList<>();
		
		ladosTriangulo.add(2);
		ladosTriangulo.add(5);
		ladosTriangulo.add(1);
		
		Triangulo t1 = new Triangulo(ladosTriangulo);
		
		//System.out.println("Figura nº 1: Triángulo, con " + t1.numLados + " lados.");
		
		for(int i = 0; i<ladosTriangulo.size(); i++) {
			bw1.write(ladosTriangulo.get(i) + "\t");
		}
		bw1.newLine();
		
		//t1.mostrarLados();
		

		ArrayList<Integer> ladosHexagono = new ArrayList<>();
		
		ladosHexagono.add(2);
		ladosHexagono.add(5);
		ladosHexagono.add(1);
		ladosHexagono.add(5);
		ladosHexagono.add(4);
		ladosHexagono.add(13);
		
		Hexagono h1 = new Hexagono(ladosHexagono);
		
		//System.out.println("Figura nº 2: Hexágono, con " + h1.numLados + " lados.");
		
		for(int i=0; i < ladosHexagono.size(); i++) {
			bw1.write(ladosHexagono.get(i) + "\t");
		}
		
		//h1.mostrarLados();

		bw1.close();
		
		String linea;
		String[] splitted;
		
		while((linea = br1.readLine())!= null) {
			splitted = linea.split("\t");
			System.out.println("La figura tiene: " + splitted.length + " lados");
			for(int i = 0; i<splitted.length; i++) {
				System.out.printf(splitted[i] + "\t");
			}
			System.out.println();
		}
		
	}
}
