package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programa4 {

	public static void main(String[] args) {

		//instanciacao de uma lista de string
		List<String> list = new ArrayList<>();
		//leitura caminho 
		String path = "D:\\workSpace\\WorkSpace Interface\\scr4\\Dados.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			//será feita a leitura de todo arquivo adcionando-os na lista
			//leitura do arquivo
			String name = br.readLine();
			//enquanto esse valor no arquivo for diferente de nulo 
			while (name != null) {
				//será adicionado na lista
				list.add(name);
				//e fará a leitura da proxima linha
				name = br.readLine();
			}
			//forma de ordenar uma colecao Collections.sort(list);
			Collections.sort(list);
			//percorrer a lista
			for (String s : list) {
				//imprimindo cada um dos elementos
				System.out.println(s);
			}
		}//tratamento das excecoes
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
