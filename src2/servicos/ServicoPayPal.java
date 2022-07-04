package servicos;


public class ServicoPayPal implements PagamentoOnline {

	private static final double FEE_PERCENTAGE = 0.02;
	private static final double MONTHLY_INTEREST = 0.01;

	@Override
	public double pagamentoFree(double quantia) {
		return quantia * FEE_PERCENTAGE;
	}

	@Override
	public double interesse(double quantia, int meses) {
		return quantia * MONTHLY_INTEREST * meses;
	}
}