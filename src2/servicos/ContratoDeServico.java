package servicos;

import java.util.Calendar;
import java.util.Date;

import entidades.Contrato;
import entidades.Prestacao;

public class ContratoDeServico {

	private PagamentoOnline pagamentoOnline;

	public ContratoDeServico(PagamentoOnline pagamentoOnline) {
		this.pagamentoOnline = pagamentoOnline;
	}

	public void contradoProcessado(Contrato contrato, int meses) {
		double quotaBasica = contrato.getTotalValor() / meses;
		for (int i = 1; i <= meses; i++) {
			Date data = addMeses(contrato.getData(), i);
			double quotaAtualizada = quotaBasica + pagamentoOnline.interesse(quotaBasica, i);
			double quotaCompleta = quotaAtualizada + pagamentoOnline.pagamentoFree(quotaAtualizada);
			contrato.addPrestacao(new Prestacao(data, quotaCompleta));
		}
	}

	private Date addMeses(Date data, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
}