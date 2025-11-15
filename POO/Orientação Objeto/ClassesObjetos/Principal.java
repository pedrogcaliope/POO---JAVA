package ClassesObjetos;

import java.util.Scanner;

public class Principal {

	private static Scanner Teclado;
	public static void main(String[] args) {

	// Instanciar 
	// Tipo   Nome   = Novo Construtor
	 Scanner Teclado = new  Scanner(System.in);
	
	 Aluno Aluno_1 = new Aluno();
	 Aluno Aluno_2 = new Aluno();
	 
	 Aluno_1.Nome  = Teclado.nextLine();
	 Aluno_1.Idade = Teclado.nextInt();
	 /*
	 Aluno_2.setNome("Maria");
	 Aluno_2.setIdade(16);
	 */
	 System.out.println(Aluno_1.getNome());
	 System.out.println(Aluno_1.Idade);

	}

}
