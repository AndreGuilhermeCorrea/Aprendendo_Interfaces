package modelos_servicos;

import modelos_entidades.AluguelCarros;
import modelos_entidades.Fatura;

public class ServicoAluguel {
	
	//CLASSE DEPENDENTE DA INTERFACE E NAO EXCLUSIVAMENTE DA TAXA DE SERVIÇO DO BRASIL

	private Double precoDia;
	private Double precoHora;
	
	//associação com taxa de servicos do brasil
	private TaxaServico taxaServico;

	public ServicoAluguel(Double precoDia, Double precoHora, TaxaServico taxaServico) {
		super();
		this.precoDia = precoDia;
		this.precoHora = precoHora;
		this.taxaServico = taxaServico;
	}
	//operação responsavel por gerar a nota de pagamento do aluguel de carro
	public void processarFatura(AluguelCarros aluguelCarros) {
				/*
				 * Duration = (25/06/2018 14:40) - (25/06/2018 10:30) = 4:10 = 5 hours Basic
				 * payment = 5 * 10 = 50 Tax = 50 * 20% = 50 * 0.2 = 10
				 */
		double valorBasicoPagamento;
		//valor em milisegundos de cada data
		long instante1 = aluguelCarros.getRetirada().getTime();
		long instante2 = aluguelCarros.getDevolucao().getTime();
		//variavel que determina a diferenca em horas das duas datas
		double horas = (double)(instante2 - instante1) / 1000 / 60 / 60;
		//teste para calculo
		if (horas <=12.0) {
			valorBasicoPagamento = Math.ceil(horas) * precoHora;		
		}else {
			//calculo do valor por dia
			valorBasicoPagamento = Math.ceil(horas / 24) * precoDia;
		}
		//calculo da taxa de serviço
		double taxa = taxaServico.taxa(valorBasicoPagamento);		
		//instanciação do novo objeto da fatura
		aluguelCarros.setFatura(new Fatura(valorBasicoPagamento, taxa));
		
		
	}
	
	
}
