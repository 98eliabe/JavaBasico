import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int n, c100, resto100, c50, resto50, c20, resto20, c10, resto10, c5, resto5, c2, resto2, c1;
			
		n = teclado.nextInt();
				
		c100 = n / 100;
		resto100 = n % 100;
		c50 = resto100 / 50;
		resto50 = resto100 % 50;
		c20 = resto50 / 20;
		resto20 = resto50 % 20;
		c10 = resto20 / 10;
		resto10 = resto20 % 10;
		c5 = resto10 / 5;
		resto5 = resto10 % 5;
		c2 = resto5 / 2;
		resto2 = resto5 % 2;
		c1 = resto2 / 1;
		
		System.out.println(n);
		System.out.println(c100 + " nota(s) de R$ 100,00");
		System.out.println(c50 + " nota(s) de R$ 50,00");
		System.out.println(c20 + " nota(s) de R$ 20,00");
		System.out.println(c10 + " nota(s) de R$ 10,00");
		System.out.println(c5 + " nota(s) de R$ 5,00");
		System.out.println(c2 + " nota(s) de R$ 2,00");
		System.out.println(c1 + " nota(s) de R$ 1,00");
		
		teclado.close();
	}
}
