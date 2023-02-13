import java.util.Scanner;

public class Kw {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		double salariominimo, valorkw, valorconta, valordesconto;
		int kwgasto, desconto;
		
		desconto = 10;
		
		System.out.println("Informe o valor do salário mínimo ");
		salariominimo = teclado.nextDouble();
		
		System.out.println("Informe a quantidade de Kw gasto ");
		kwgasto = teclado.nextInt();
		
		valorkw = salariominimo / 700;
		valorconta = kwgasto * valorkw;
		valordesconto = valorconta - (valorconta * desconto / 100);
				
		System.out.printf("O valor do Kw é de %.2f reais\n",  valorkw);		
		System.out.printf("O valor total a ser pago é de %.2f reais\n", valorconta);
		System.out.printf("O valor a ser pago com desconte é de %.2f reais\n", valordesconto);
		
		teclado.close();
	}
}
