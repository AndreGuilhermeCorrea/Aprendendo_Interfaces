package servicos;

import java.security.InvalidParameterException;

public class ServicosBrasil {

	private double taxajuros;

	public ServicosBrasil(double taxajuros) {
		this.taxajuros = taxajuros;
	}

	public double getTaxajuros() {
		return taxajuros;
	}

	public double pagamento(double quantia, int meses) {
		if (meses < 1) {
			// excecao
			throw new InvalidParameterException("Tempo inválido. (meses > 0)! ");
		}
		
		
		/*
		 * calculo valor das parcelas com juros 
		
		Payment = amount * (1 + interestRate / 100)N
		*/
		
		return quantia * Math.pow(1.0 + taxajuros / 100.00, meses);
	}

}
