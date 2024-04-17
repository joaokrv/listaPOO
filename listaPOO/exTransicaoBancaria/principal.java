package exTransicaoBancaria;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Conta conta1 = new Conta("Pedro", 157, 1000);
        Conta conta2 = new Conta("João", 222, 758);

        Transacao transacaoConta;

            int escolha;
            
            do {
                System.out.print("\nEscolha uma opção:\n1 - Sacar\n2 - Depositar\n3 - Transferir\n0 - Sair\nOpção: ");
                escolha = in.nextInt();

                switch (escolha) {
                    case 1:
                        System.out.print("Digite o valor a sacar da conta do " + conta1.getNome() + ": R$ ");
                        double valorSaque = in.nextDouble();
                        conta1.debito(valorSaque);
                        break;
                    case 2:
                        System.out.print("Digite o valor a depositar na conta do " + conta1.getNome() + ": R$ ");
                        double valorDeposito = in.nextDouble();
                        conta1.credito(valorDeposito);
                        break;
                    case 3:
                        System.out.print("Digite o valor a transferir da conta do " + conta1.getNome() + " para " + conta2.getNome() + ": R$ ");
                        double valorTransferencia = in.nextDouble();
                        transacaoConta = new Transacao(valorTransferencia, conta2, conta1);
                        transacaoConta.efetuarTransacao();
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            
            } while (escolha != 0);

        in.close();
    }
}