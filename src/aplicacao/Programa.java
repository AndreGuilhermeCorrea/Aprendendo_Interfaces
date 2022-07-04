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
		
		System.out.println("Entre com os dados do Aluguel do veículo: ");
		System.out.print("Modelo Carro: ");
		String modeloCarro = sc.nextLine();
		System.out.print("Dia da Retirada do veículo (dd/MM/yyyy HH:mm): ");	
		Date retirada = sdf.parse(sc.nextLine());
		System.out.print("Dia da Devolução do veículo (dd/MM/yyyy HH:mm): ");	
		Date devolucao = sdf.parse(sc.nextLine());
		
		AluguelCarros rent = new AluguelCarros(retirada, devolucao, new Veiculos(modeloCarro));
		
		System.out.print("Preço por hora: ");
		double precoHora = sc.nextDouble();
		System.out.print("Preço por Dia: ");
		double precoDia = sc.nextDouble();
		
		ServicoAluguel servicoAluguel = new ServicoAluguel(precoDia, precoHora, new TaxaServicosBrasil());
		servicoAluguel.processarFatura(rent);
		
		System.out.println("Dados do Aluguel: ");
		System.out.println("Pagamento Básico: " + String.format("%.2f", rent.getFatura().getPagamentoBasico()));
		System.out.println("Taxa: " + String.format("%.2f", rent.getFatura().getTaxa()));
		System.out.println("Total Aluguel: " + String.format("%.2f", rent.getFatura().getPagamentoTotal()));
		
		sc.close();



	}

}
