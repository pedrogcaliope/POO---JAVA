package TratamentoArquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArquivoTXT {

	public static void main(String[] args) {
		String txtFile = "mensagens.txt";
        //String txtFile = "C:\\Users\\SeuUsuario\\Documents\\mensagens.txt";

        String linha;

        try (BufferedReader br = new BufferedReader(new FileReader(txtFile))) {
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
