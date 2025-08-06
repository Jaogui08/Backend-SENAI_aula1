package backend.aula1;

import java.util.ArrayList;

public class Exemplo_array {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add("Mario");
		nomes.add("João");
		nomes.add("Simas");
		nomes.add("Dani");
		nomes.add("Romeu");
		nomes.add("Ronaldo");
		
		
		try {
			System.out.print("Nome: " + nomes.get(5));
		} catch (Exception erro) {
			System.out.println("Não existe um 6° nome nessa lista");
		}

	}

}
