package Aulas;

import java.util.Scanner;

public class SwitchCase {

	private static Scanner Entrada;

	public static void main(String[] args) {
		  Entrada = new Scanner(System.in);
		  
		  System.out.print("Entre com um n�mero entre 1 e 4:");
		  int num = Entrada.nextInt();
		  
		  switch (num) {
		     case 1:
		    	 System.out.println("Voc� escolheu 1");
		       break;
		     case 2:
		       System.out.println("Voc� escolheu 2");
		       break;
		     case 3:
		       System.out.println("Voc� escolheu 3");
		       break;
		     case 4:
		       System.out.println("Voc� escolheu 4");
		       break;
		     default:
		       System.out.println("N�mero inv�lido");
		  }
		}
	}
