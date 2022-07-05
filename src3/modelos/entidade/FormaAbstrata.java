package modelos.entidade;

import modelos.enumeracoes.Cor;
//classe abstrata que implementa a forma e define o atrbuto cor

public abstract class FormaAbstrata implements Forma {

	private Cor cor;

	public FormaAbstrata(Cor cor) {
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
}

