package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

	private Integer numero;
	private Date data;
	private Double totalValor;

	private List<Prestacao> prestacoes = new ArrayList<>();

	public Contrato(Integer numero, Date data, Double totalValor) {
		this.numero = numero;
		this.data = data;
		this.totalValor = totalValor;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getTotalValor() {
		return totalValor;
	}

	public void setTotalValue(Double totalValor) {
		this.totalValor = totalValor;
	}

	public List<Prestacao> getprestacoes() {
		return prestacoes;
	}

	public void addPrestacao(Prestacao prestacao) {
		prestacoes.add(prestacao);
	}

	public void removePrestacao(Prestacao prestacao) {
		prestacoes.remove(prestacao);
	}
}