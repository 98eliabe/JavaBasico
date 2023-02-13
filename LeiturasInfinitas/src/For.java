import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		for (int numero = 0; numero != -1;) {
			System.out.println("Digite um numero ");
			numero = teclado.nextInt();
		}
		System.out.println("FIM!");
		
		teclado.close();	
	}
}
