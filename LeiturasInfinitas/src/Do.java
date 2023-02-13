import java.util.Scanner;

public class Do {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int numero;
		
		do {
			System.out.println("Digite um numero: ");
			numero = teclado.nextInt();
			
		} while (numero != -1);
		System.out.println("FIM!");
		
		teclado.close();		
	}
}
