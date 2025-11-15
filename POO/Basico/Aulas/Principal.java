package Aulas;

import java.util.Scanner;

public class Principal {

	private static Scanner teclado;

	public static void main(String[] args) {  
		
		float Valor_1, Valor_2, Result = 0;
		
		teclado = new Scanner(System.in); 				// Ler Valor de Entrada

		System.out.print("Digite o primeiro Valor: ");  // Escrever na Tela
		Valor_1 = teclado.nextFloat();
		
		System.out.print("Digite o segundo Valor: ");
		Valor_2 = teclado.nextFloat();
		
		System.out.print("Digite a Opera��o: ");
		int Operador = teclado.nextInt();
		
		if (Operador == 1) {
			Result = Valor_1 + Valor_2; //Soma
			System.out.printf("Result Soma = %f", Result);
			
		}else if(Operador == 2) {
			Result = Valor_1 - Valor_2;	//Sub
			System.out.printf("Result Sub = %f", Result);

		}else if(Operador == 3) {
			
			if(Valor_2 == 0) {
				System.out.println("Erro Divis�o por 0 !!!");
				
			}else {
				Result = Valor_1 / Valor_2;	//Div
				System.out.printf("Result Div = %.1f", Result);
				
			}

		}else if(Operador == 4) {
			Result = Valor_1 * Valor_2;	//Mult
			System.out.printf("Result Mult = %f", Result);

		}else{
			System.out.println("Opera��o Invalida!!!");
		}
		
	}	
	

}
