import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

public class ListaErros {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String logName = "log" + date + ".txt";

        try (BufferedReader br = new BufferedReader(new FileReader(logName))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo de log: " + e.getMessage());
        }
    }
}
