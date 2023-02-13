import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int comeco, termino;
		
		comeco = teclado.nextInt();
		termino = teclado.nextInt();
		
		if (comeco > termino) { 
			System.out.println("O JOGO DUROU " + (24 - (comeco - termino)) + " HORA(S)");
		} 
		else if (termino > comeco) {
			System.out.println("O JOGO DUROU " + (termino - comeco) + " HORA(S)");
		} 
		else {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
			
		teclado.close();
	}
}
