package backend.aula1;

import java.util.Scanner;

public class Exemplo_erro {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = 10;
		
		System.out.print("Digite um número: ");
		int b = scanner.nextInt();
		
		try{
			int c = a/b;
			System.out.println("\nValor de C: " + c);
		} catch (ArithmeticException erro) {
			System.out.println("\nNão existe divisão por zero");
		}
		scanner.close();

	}

}
