package aplicacao;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Contrato;
import entidades.Prestacao;
import servicos.ContratoDeServico;
import servicos.ServicoPayPal;

public class Programa2 {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Entre com os dados ");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		Date data = sdf.parse(sc.next());
		System.out.print("Valor contrato: ");
		double totalValor = sc.nextDouble();

		Contrato contrato = new Contrato(numero, data, totalValor);

		System.out.print("Entre com o numero de Parcelas: ");
		int n = sc.nextInt();

		ContratoDeServico contratoDeServico = new ContratoDeServico(new ServicoPayPal());

		contratoDeServico.contradoProcessado(contrato, n);

		System.out.println("Prestacões:");
		for (Prestacao x : contrato.getprestacoes()) {
			System.out.println(x);
		}

		sc.close();
	}
}