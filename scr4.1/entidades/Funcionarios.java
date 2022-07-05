package entidades;

//para que a classe funcionario seja ordenado pelo metodo sort deve se implementar a interface Comparable
//quando uma classe é comparavel significa que o contrato esta dizendo como se compara o objeto com outro objeto

//implemetação básica da classe funcionario
public class Funcionarios implements Comparable<Funcionarios> {
	
	private String nome;
	private Double salario;
	
	
	//construtor com argumentos
	public Funcionarios(String nome, Double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	//gethers e sethers
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	//metodo que faz a comparacao de um objeto com outro
	//implementar a comparaçao de um funcionario com outro através de comparacao de ordem alfabética(nome) e retornando inteiro
	@Override
	public int compareTo(Funcionarios outro) {

		return nome.compareTo(outro.getNome());
	}
	

}
