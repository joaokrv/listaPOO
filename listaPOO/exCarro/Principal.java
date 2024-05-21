import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Carro carro1 = new Carro();

        char modo;

        try {
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
            System.err.println("Entrada inválida. Digite um número válido.");
        } catch (NoSuchElementException e) {
            System.err.println("Entrada inválida. Verifique se todos os campos foram preenchidos.");
        } catch (IllegalArgumentException e) {
            System.err.println("Ocorreu um erro: " + e.getMessage());
        } finally {
            in.close(); // Garantindo que o scanner seja fechado
        }
    }
}