package backend.aula1;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double nota;

		System.out.print("Digite sua nota: ");
		try {
			nota = scanner.nextDouble();
		} catch (Exception error) {
			System.out.println("Nota informada inválida");
			scanner.close();
			return;
		}

		if (nota >= 6) {
			System.out.println("\nVocê está aprovado");
		} else if (nota < 6 && nota >= 4) {
			System.out.println("\nVocê foi encaminhado para o exame");
		} else {
			System.out.println("\nVocê está reprovado");
		}
		scanner.close();

	}

}
