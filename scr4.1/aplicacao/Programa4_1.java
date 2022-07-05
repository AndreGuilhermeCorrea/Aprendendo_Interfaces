package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entidades.Funcionarios;

public class Programa4_1 {

	public static void main(String[] args) {

		//instanciacao de uma lista de FUNCIONARIO
		List<Funcionarios> list = new ArrayList<>();
		//leitura caminho 
		String path = "D:\\workSpace\\WorkSpace Interface\\scr4\\Dados 2.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			//será feita a leitura de todo arquivo adcionando-os na lista
			//leitura do arquivo
			String funcionariosCsv = br.readLine();
			//enquanto esse valor no arquivo for diferente de nulo 
			while (funcionariosCsv != null) {
				
				//recorte da string em 2 nome e salario
				//vetor de strings que cada posicao cria um campo (Maria Brown,4300.00)
				String[] campos = funcionariosCsv.split(",");
				
				//no momento de instanciar o funcionario será adicionado na lista o vetor campos na posicao(campos[0])
				list.add(new Funcionarios(campos[0], Double.parseDouble(campos[1])));
				//e fará a leitura da proxima linha
				funcionariosCsv = br.readLine();
			}
			
			//para que a classe funcionario seja ordenado pelo metodo sort deve se implementar a interface Comparable
			//quando uma classe é comparavel significa que o contrato esta dizendo como se compara o objeto com outro objeto
			//forma de ordenar uma colecao Collections.sort(list);
			Collections.sort(list);
			//percorrer a lista
			for (Funcionarios fc : list) {
				//imprimindo cada um dos elementos
				System.out.println(fc.getNome() + ", " + fc.getSalario());
			}
		}//tratamento das excecoes
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}