package aplicacao5_1;

import java.util.Locale;
import java.util.Scanner;

import servicos5_1.ServicosUSA5_1;
import servicos5_1.TaxaJuros;


public class Programa5_1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantia: ");
		double quantia = sc.nextDouble();
		System.out.print("Meses: ");
		int meses = sc.nextInt();

		TaxaJuros is = new ServicosUSA5_1(1.0);
		double pagamento = is.pagamento(quantia, meses);

		System.out.println("São " + meses + "x no valor de:");
		System.out.println("R$" + String.format("%.2f", pagamento) + " reais por parcela.");

		sc.close();
	}
}