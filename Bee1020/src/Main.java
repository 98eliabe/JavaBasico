import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int idade, anos, meses, dias, restoanos, restomeses;
			
		idade = teclado.nextInt();
				
		anos = idade / 365;
		restoanos = idade % 365;
		meses = restoanos / 30;
		restomeses = restoanos % 30;
		dias = restomeses;		
		
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
		
		teclado.close();
	}
}
