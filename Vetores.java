package backend.aula1;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a[] = new int[2];
		int b[] = new int[2];
		int c[] = new int[4];

		System.out.println("Vetor A:");
		for (int i = 0; i < 2; i++) {
			System.out.print("Informe o " + (i + 1) + " valor inteiro: ");
			try {
				a[i] = scanner.nextInt();
			} catch (Exception error) {
				System.out.println("\nValor informado inválido");
				scanner.close();
				return;
			}
		}

		System.out.println("\nVetor B:");
		for (int i = 0; i < 2; i++) {
			System.out.print("Informe o " + (i + 1) + " valor inteiro: ");
			try {
				b[i] = scanner.nextInt();
			} catch (Exception error) {
				System.out.println("\nValor informado inválido");
				scanner.close();
				return;
			}
		}

		for (int i = 0; i < 2; i++) {
			c[i] = a[i];
			c[i + 2] = b[i];
		}

		System.out.println("\nVetor C:");
		for (int i = 0; i < 4; i++) {
			System.out.println((i + 1) + "° valor: " + c[i]);
		}
		scanner.close();

	}

}
