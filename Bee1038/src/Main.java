import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int cod, qtd;
		double total;
		
		cod = teclado.nextInt();
		qtd = teclado.nextInt();
		
		if (cod == 1) {
			total = 4.00 * qtd;
		}
		else if (cod == 2) {
			total = 4.50 * qtd;
		}
		else if (cod == 3) {
			total = 5.00 * qtd;
		}
		else if (cod == 4) {
			total = 2.00 * qtd;
		}
		else {
			total = 1.50 * qtd;
		}
		
		System.out.printf("Total: R$ %.2f\n", total);
		
		teclado.close();
	}
}
