import java.util.Scanner;

public class SalarioFunc {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		double horavalor, salariobruto, salarioliquido, desconto;
		int horatrabalho;
		
		
		System.out.println("Informe o valor da hora trabalhada ");
		horavalor = teclado.nextDouble();
		
		System.out.println("Informe a quantidade de horas trabalhadas ");
		horatrabalho = teclado.nextInt();
		
		salariobruto = horatrabalho * horavalor;
				
		System.out.println("Informe a porcentagem de desconto de INSS ");		
		desconto = teclado.nextDouble();
		
		salarioliquido = salariobruto - (salariobruto * desconto /100);
		
		System.out.println("O valor líquido a receber é de "+ salarioliquido);
		
		teclado.close();
	}
}
