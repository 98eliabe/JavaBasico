import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int numero = 0;
		
		while (numero != -1) {
			System.out.println("Digite um numero ");
			numero = teclado.nextInt();
		}
		System.out.println("FIM!");
		
		teclado.close();
	}
}
