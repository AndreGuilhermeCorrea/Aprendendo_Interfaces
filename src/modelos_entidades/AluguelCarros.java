package modelos_entidades;

import java.util.Date;

public class AluguelCarros {
	
	private Date retirada;
	private Date devolucao;
	
	private Veiculos veiculos;
	private Fatura fatura;
	
	//construtor padrão
	public AluguelCarros() {		
	}

	//construtor com argumentos
	public AluguelCarros(Date retirada, Date devolucao, Veiculos veiculos) {
		this.retirada = retirada;
		this.devolucao = devolucao;
		this.veiculos = veiculos;
	}

	public Date getRetirada() {
		return retirada;
	}

	public void setRetirada(Date retirada) {
		this.retirada = retirada;
	}

	public Date getDevolucao() {
		return devolucao;
	}

	public void setDevolucao(Date devolucao) {
		this.devolucao = devolucao;
	}

	public Veiculos getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(Veiculos veiculos) {
		this.veiculos = veiculos;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}
	
	
	
}
