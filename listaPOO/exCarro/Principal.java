import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.time.LocalDate;

public class Principal {
    private static final Logger logger = Logger.getLogger(Principal.class.getName());

    public static void main(String[] args) {
        // Configurar o logger
        try {
            LocalDate date = LocalDate.now();
            String logName = "log" + date + ".txt";
            FileHandler fileHandler = new FileHandler(logName, true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            logger.info("Programa iniciado e logger configurado corretamente.");
        } catch (IOException e) {
            System.err.println("Não foi possível configurar o logger: " + e.getMessage());
            return;
        }

        // Uso de try-with-resources para garantir o fechamento do Scanner
        try (Scanner in = new Scanner(System.in)) {
            Carro carro1 = new Carro();
            char modo;

            System.out.print("Qual modelo você quer? ");
            carro1.setModelo(in.nextLine().trim());

            System.out.print("De qual marca ele é? ");
            carro1.setMarca(in.nextLine().trim());

            System.out.print("Digite a velocidade inicial do carro: ");
            carro1.setVelocidade(in.nextInt());

            do {
                System.out.print("\nCaso queira acelerar digite A, caso queira frear digite F, ou digite 0 para sair: ");
                modo = in.next().charAt(0);
                in.nextLine(); // Consumir a quebra de linha

                switch (modo) {
                    case 'A':
                        carro1.acelerar();
                        System.out.println("\n" + carro1.velocidadeAtual());
                        break;
                    case 'F':
                        carro1.freiar();
                        System.out.println("\n" + carro1.velocidadeAtual());
                        break;
                    case '0':
                        System.out.println("\n" + carro1.velocidadeAtual() + "\nSaindo do programa...");
                        break;
                    default:
                        System.err.println("Opção inválida. Tente novamente.");
                }
            } while (modo != '0');
        } catch (InputMismatchException e) {
            logger.log(Level.SEVERE, "Entrada inválida. Digite um número válido.", e);
            System.err.println("Entrada inválida. Digite um número válido.");
        } catch (NoSuchElementException e) {
            logger.log(Level.SEVERE, "Entrada inválida. Verifique se todos os campos foram preenchidos.", e);
            System.err.println("Entrada inválida. Verifique se todos os campos foram preenchidos.");
        } catch (IllegalArgumentException e) {
            logger.log(Level.SEVERE, "Ocorreu um erro: " + e.getMessage(), e);
            System.err.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}