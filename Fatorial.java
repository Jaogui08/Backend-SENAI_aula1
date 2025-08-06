package backend.aula1;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num, fat = 1;

		System.out.print("Informe um número inteiro que gostaria de saber o fatorial: ");
		try {
			num = scanner.nextInt();
		} catch (Exception error) {
			System.out.println("\nO valor informado é inválido");
			scanner.close();
			return;
		}

		if (num <= 0) {
			System.out.println("\nErro, não existe fatorial de número negativo");
			scanner.close();
			return;
		}

		for (int i = 1; i <= num; i++) {
			fat *= i;
		}

		System.out.println("\nO fatorial de " + num + " é igual a: " + fat);

		scanner.close();

	}

}
