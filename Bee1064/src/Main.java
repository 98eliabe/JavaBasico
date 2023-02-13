import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double valores, soma = 0;
		int positivos = 0;

		for (int contador = 1; contador <= 6; contador++) {
			valores = teclado.nextDouble();
			if (valores > 0) {
				positivos++;
				soma += valores;
			}
		}
		System.out.println(positivos + " valores positivos");
		System.out.printf("%.1f\n", soma / positivos);
		teclado.close();
	}
}
