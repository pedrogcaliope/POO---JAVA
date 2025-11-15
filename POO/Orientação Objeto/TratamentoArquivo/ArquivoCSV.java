package TratamentoArquivo;

import java.io.FileWriter;
import java.io.IOException;

public class ArquivoCSV {
    public static void main(String[] args) {
        String csvFile = "dados.csv";
        //String csvFile = "C:\\Users\\SeuUsuario\\Documents\\dados.csv";

        FileWriter writer = null;

        try {
            writer = new FileWriter(csvFile);

            writer.append("Nome,Idade,Email\n");
            writer.append("Alice,30,alice@example.com\n");
            writer.append("Bob,25,bob@example.com\n");
            writer.append("Charlie,35,charlie@example.com\n");

            System.out.println("Arquivo CSV criado com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
