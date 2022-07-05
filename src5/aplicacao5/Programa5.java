package aplicacao5;

import java.util.Locale;
import java.util.Scanner;

import servicos5_1.ServicosBrasil5_1;

public class Programa5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantia: ");
		double quantia = sc.nextDouble();
		System.out.print("Meses: ");
		int meses = sc.nextInt();

		ServicosBrasil5_1 is = new ServicosBrasil5_1(2.0);
		double pagamento = is.pagamento(quantia, meses);

		System.out.println("São " + meses + "x no valor de:");
		System.out.println("R$" + String.format("%.2f", pagamento) + " reais por parcela.");

		sc.close();
	}
}