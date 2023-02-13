import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int valores, par = 0, impar = 0, neg = 0, pos = 0;

		for (int cont = 1; cont < 6; cont++) {
			valores = teclado.nextInt();
			if (valores % 2 == 0) {
				par++;
			} else if (valores % 2 == 1 || valores % 2 == -1) {
				impar++;
			}
			if (valores > 0) {
				pos++;
			} else if (valores < 0) {
				neg++;
			}
		}
		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(pos + " valor(es) positivo(s)");
		System.out.println(neg + " valor(es) negativo(s)");
		teclado.close();
	}
}
