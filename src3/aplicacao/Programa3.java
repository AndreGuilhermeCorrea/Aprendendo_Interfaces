package aplicacao;

import modelos.entidade.Circulo;
import modelos.entidade.FormaAbstrata;
import modelos.entidade.Retangulo;
import modelos.enumeracoes.Cor;

public class Programa3 {

	public static void main(String[] args) {

		FormaAbstrata s1 = new Circulo(Cor.PRETO, 2.0);
		FormaAbstrata s2 = new Retangulo(Cor.BRANCO, 3.0, 4.0);

		System.out.println("Cor do Circulo: " + s1.getCor());
		System.out.println("Area do Circulo: " + String.format("%.3f", s1.area()));
		System.out.println("Cor do Retangulo: " + s2.getCor());
		System.out.println("Area do Retangulo: " + String.format("%.3f", s2.area()));
	}
}