package modelos_servicos;

//classe que implemetentam a interface e cumpre o contrato da interface
public class TaxaServicosBrasil implements TaxaServico{

	//método taxa que retornará quantia tipo double
	public double taxa(double quantia) {
		if (quantia <= 100.0) {
			return quantia * 0.2;			
		} else {
			return quantia * 0.15;
		}		
	}
	
	
	
}

