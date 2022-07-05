package servicos5_1;

import java.security.InvalidParameterException;

public interface TaxaJuros {

	// declaracao do contrato
	double getTaxaJuros();

	default double pagamento(double quantia, int meses) {
		if (meses < 1) {
			// excecao
			throw new InvalidParameterException("Tempo inválido. (meses > 0)! ");
		}

		/*
		 * calculo valor das parcelas com juros
		 * 
		 * Payment = amount * (1 + interestRate / 100)N
		 */

		return quantia * Math.pow(1.0 + getTaxaJuros() / 100.00, meses);
	}

}
