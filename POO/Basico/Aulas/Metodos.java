package Aulas;

import java.util.Scanner;

public class Metodos {

	private static Scanner teclado;
	
	private static int Valor_1, Valor_2;
	
	static int somar(int Valor_1, int Valor_2) {
		int Result = Valor_1 + Valor_2;
		return Result;	
	}
	
	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);

		System.out.print("Digite os primeiro Valores: ");
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		
		int Resposta = somar(a, b); 						// Valor_1 = a       e 		Valor_2 = b
		System.out.printf("o resultado �: %d ", Resposta);
	}

}
