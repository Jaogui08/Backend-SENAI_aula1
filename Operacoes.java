package backend.aula1;

import java.util.Scanner;

public class Operacoes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		
		System.out.print("Informe o primeiro número inteiro: ");
		try {
			a = scanner.nextInt();
		} catch (Exception erro) {
			System.out.print("Informação inválida");
			scanner.close();
			return;
		}
		
		System.out.print("Informe o segundo número inteiro: ");
		try {
			b = scanner.nextInt();
		} catch (Exception erro) {
			System.out.print("Informação inválida");
			scanner.close();
			return;
		}
		
		System.out.print("\nResultados:\n");
		System.out.println("Soma: " + (a + b));
		System.out.println("Subtração: " + (a - b));
		System.out.println("Multiplicação: " + (a * b));
		try {
			System.out.println("Divisão inteira: " + (a % b));
			System.out.println("Divisão exata: " + ((double) a / b));
		} catch (Exception erro) {
			System.out.println("Divisão por zero não existe!");
		}
		scanner.close();

	}

}
