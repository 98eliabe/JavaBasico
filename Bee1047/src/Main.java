import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int hInicio, mInicio, hFinal, mFinal;
		
		hInicio = teclado.nextInt();
		mInicio = teclado.nextInt();
		hFinal = teclado.nextInt();
		mFinal = teclado.nextInt();
		
		int tempoI = hInicio * 60 + mInicio;
		int tempoF = hFinal * 60 + mFinal;
		
		int duracao = tempoF - tempoI;
		if (duracao <= 0) {
			duracao = duracao + 24 * 60;
		}
		
		int durH = duracao / 60;
		int durM = duracao % 60;
		
		System.out.println("O JOGO DUROU " + durH + " HORA(S) E " + durM + " MINUTO(S)");
		
		teclado.close();
	}
}
