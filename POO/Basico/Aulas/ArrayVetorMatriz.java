package Aulas;

public class ArrayVetorMatriz {
    public static void main(String[] args) {
        
        //int[] a = new int[4];
       
        //int[] b;
        //b = new int[10];

        //int[] r = new int[44], k = new int[23];

        //int[] iniciaValores = {12,32,54,6,8,89,64,64,6};

        int[] meuArray;

        //ALOCA MEM�RIA PARA 10 INTEIROS
        meuArray = new int[10];

        //INICIALIZA O PRIMEIRO ELEMENTO
        meuArray [0] = 100;
        meuArray [1] = 85;
        meuArray [2] = 88;
        meuArray [3] = 93;
        meuArray [4] = 123;
        meuArray [5] = 952;
        meuArray [6] = 344;
        meuArray [7] = 233;
        meuArray [8] = 622;
        meuArray [9] = 8522;
        //meuArray [10] = 564; //ESTOURA A PILHA POIS N�O EXISTE O �NDICE 10

        System.out.println(meuArray[9]);
        System.out.println(meuArray[2]);

        
		//Percorrer Vetor/Array
		for(int i = 0; i <= 5; i++ ) {
			
			meuArray[i] = 12;// Linhas de Comando

		}
			
		//Percorrer Matriz
		for(int i = 0; i <= 2; i++ ){
			for(int j = 0; j<=2; j++) {		
				// Linha de Comandos
			}
		}

    }
}
