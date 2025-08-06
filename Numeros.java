package backend.aula1;

import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;

		System.out.print("Informe um número inteiro de 1 a 3: ");
		try {
			num = scanner.nextInt();
		} catch (Exception error) {
			System.out.println("\nValor informado inválido");
			scanner.close();
			return;
		}

		switch (num) {
		case 1:
			System.out.println("\nO número escolhido foi 1");
			break;
		case 2:
			System.out.println("\nO número escolhido foi 2");
			break;
		case 3:
			System.out.println("\nO número escolhido foi 3");
			break;
		default:
			System.out.println("\nO número escolhido é inválido");
			break;
		}
		scanner.close();

	}

}
