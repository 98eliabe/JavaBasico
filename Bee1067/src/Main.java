import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
	
		int X;
		X = teclado.nextInt();
		
		for (int impar = 0; impar <= X; impar ++) {
			if (impar % 2 != 0)
			System.out.println(impar);
		}
				
		teclado.close();	
}
}
