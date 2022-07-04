package modelos_entidades;

public class Veiculos {
	
	private String modelo;
	
	//construtor padrão
	public Veiculos() {
	}
	//construtor com argumentos
	public Veiculos(String modelo) {
		this.modelo = modelo;
	}
	//gethers e sethers
	public String getmodelo() {
		return modelo;
	}

	public void setmodelo(String modelo) {
		this.modelo = modelo;
	}
}


