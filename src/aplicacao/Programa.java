package aplicacao;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import modelos_entidades.AluguelCarros;
import modelos_entidades.Veiculos;
import modelos_servicos.ServicoAluguel;
import modelos_servicos.TaxaServicosBrasil;

public class Programa {

	public static void main(String[] args) throws ParseException{
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do Aluguel do ve�culo: ");
		System.out.print("Modelo Carro: ");
		String modeloCarro = sc.nextLine();
		System.out.print("Dia da Retirada do ve�culo (dd/MM/yyyy HH:mm): ");	
		Date retirada = sdf.parse(sc.nextLine());
		System.out.print("Dia da Devolu��o do ve�culo (dd/MM/yyyy HH:mm): ");	
		Date devolucao = sdf.parse(sc.nextLine());
		
		AluguelCarros rent = new AluguelCarros(retirada, devolucao, new Veiculos(modeloCarro));
		
		System.out.print("Pre�o por hora: ");
		double precoHora = sc.nextDouble();
		System.out.print("Pre�o por Dia: ");
		double precoDia = sc.nextDouble();
		
		ServicoAluguel servicoAluguel = new ServicoAluguel(precoDia, precoHora, new TaxaServicosBrasil());
		//no momento da instanciacao new ServicoAluguel(precoDia, precoHora, new TaxaServicosBrasil());
		//nessa instanciacao new TaxaServicosBrasil()) casando com o parametro do tipo taxa de servi�o(interface) esta acontecendo um upcasting, inje��o de dependencia por meio de construtor
		/*o objeto de servi�o de imposto do qual a classe public class ServicoAluguel depende � 
		 * instanciado pelo programa principal, essa instancia injetada no public class ServicoAluguel 
		 * por meio do construtor: public ServicoAluguel(Double precoDia, Double precoHora, TaxaServico taxaServico)
		 * nesse sentido o programa principal ficou respons�vel por fornecer o local da dependencia*/
		//public interface TaxaServico � um tipo gen�rico
		//public class TaxaServicosBrasil � um tipo especifico concreto
		servicoAluguel.processarFatura(rent);
		
		System.out.println("Dados do Aluguel: ");
		System.out.println("Pagamento B�sico: " + String.format("%.2f", rent.getFatura().getPagamentoBasico()));
		System.out.println("Taxa: " + String.format("%.2f", rent.getFatura().getTaxa()));
		System.out.println("Total Aluguel: " + String.format("%.2f", rent.getFatura().getPagamentoTotal()));
		
		sc.close();



	}

}
