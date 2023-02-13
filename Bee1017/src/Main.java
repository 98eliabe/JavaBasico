import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		double distancia, litrosgastos;
		int tempo, velocidade;
		
		tempo = teclado.nextInt();
		velocidade = teclado.nextInt();
		
		distancia = velocidade * tempo;
				
		litrosgastos = distancia / 12;
		
		System.out.printf("%.3f\n", litrosgastos);
		
		teclado.close();
	}
}
