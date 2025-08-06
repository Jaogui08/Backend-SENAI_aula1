package backend.aula1;

import java.util.Scanner;

public class Maior_menor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double v1, v2, v3;

		System.out.print("Informe o primeiro valor: ");
		try {
			v1 = scanner.nextDouble();
		} catch (Exception error) {
			System.out.println("\nValor informado inválido");
			scanner.close();
			return;
		}

		System.out.print("\nInforme o segundo valor: ");
		try {
			v2 = scanner.nextDouble();
		} catch (Exception error) {
			System.out.println("\nValor informado inválido");
			scanner.close();
			return;
		}

		System.out.print("\nInforme o terceiro valor: ");
		try {
			v3 = scanner.nextDouble();
		} catch (Exception error) {
			System.out.println("\nValor informado inválido");
			scanner.close();
			return;
		}

		if (v1 > v2 && v1 > v3) {
			System.out.println("\nO primeiro valor é o maior");
		} else if (v2 > v1 && v2 > v3) {
			System.out.println("\nO segundo valor é o maior");
		} else if (v1 == v2 && v1 == v3) {
			System.out.println("\nTodos os valores são iguais");
		} else {
			System.out.println("\nO terceiro valor é o maior");
		}
		scanner.close();

	}

}
