package Aulas;

public class For_While_DoWhile {

	public static void main(String[] args) {
		
		int i; //Contadora
	
		System.out.print("Condição For Incremento \n");	
		
		// for(Inicio; Fim; Contador  )
		
		for(i = 0; i < 10; i++ ) { 
			System.out.printf("%d \t", i);

		}
		
		System.out.print("\nCondição For Decremento \n");		
		for(i = 9; i >= 0; i-- ) {  // Para
			System.out.printf("%d \t", i);
		}
		

		System.out.print("\nCondição While \n");		
		
		int j = 0; 
		
		// !  -> N�o 
		// != -> Diferente(N�o Igual)
		// == -> Igual
		// =  -> Atribui��o
		
		while(j != 10){
		  System.out.printf("%d \t", j);
		  j++;
		}

		System.out.print("\nCondição DoWhile \n");		

		int x = 2;
		System.out.printf("%d \t", x);
		
		do{
			System.out.printf("%d \t", x);
			x--;
		}while(x != 0 );
			

	}
		
}


