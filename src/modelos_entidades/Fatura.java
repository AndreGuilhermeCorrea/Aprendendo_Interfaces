package modelos_entidades;

public class Fatura {
	
	private Double pagamentoBasico;
	private Double taxa;
	
	//construtor padrão
	public Fatura() {
		
	}
	//construtor com argumentos
	public Fatura(Double pagamentoBasico, Double taxa) {
		this.pagamentoBasico = pagamentoBasico;
		this.taxa = taxa;
	}
	
	//gether e sether
	public Double getPagamentoBasico() {
		return pagamentoBasico;
	}
	public void setPagamentoBasico(Double pagamentoBasico) {
		this.pagamentoBasico = pagamentoBasico;
	}
	public Double getTaxa() {
		return taxa;
	}
	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	public Double getPagamentoTotal(){
		return getPagamentoBasico() + getTaxa();
	}
	
	
	
	
	

}
