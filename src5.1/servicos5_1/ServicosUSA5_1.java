package servicos5_1;

public class ServicosUSA5_1 implements TaxaJuros {

	private double taxaJuros;

	public ServicosUSA5_1(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	@Override
	public double getTaxaJuros() {
		return taxaJuros;
	}

}
