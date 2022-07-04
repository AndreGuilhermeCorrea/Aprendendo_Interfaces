package servicos;

public interface PagamentoOnline {

	double pagamentoFree(double quantia);
	double interesse(double quantia, int meses);
}