import java.util.Scanner;

public class Litros {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		double distancia, litrosgastos;
		int tempo, velocidade, consumo;
		
		consumo = 12;
		
		System.out.println("Informe o tempo gasto na viagem (horas) ");
		tempo = teclado.nextInt();
		
		System.out.println("Informe a velocidade média ");
		velocidade = teclado.nextInt();
		
		distancia = velocidade * tempo;
				
		litrosgastos = distancia / consumo;
		
		System.out.println("A quantidade de litros gastos foi de "+ litrosgastos + " litros");
		
		teclado.close();
	}
}
