package exContaBancaria;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        ContaBancaria minhaConta = new ContaBancaria();
        int i;

        Scanner in = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("00.00");

            System.out.print("Insira aqui seu nome: ");
            minhaConta.setNomeTitular(in.nextLine());

            System.out.print("Digite aqui o número da sua conta: ");
            minhaConta.setNumConta(in.nextInt());

            System.out.print("Seu saldo é de: R$" + dec.format(minhaConta.getSaldo()) + "\n");

            do {
                
                System.out.println("\nDigite a operação que deseja fazer: \n1 - Depósito\n2 - Saque\n3 - Sair");
                i = in.nextInt();
                
                switch (i) {
                    case 1:
                            System.out.print("\nDigite o valor do depósito: R$ ");
                            minhaConta.setValor(in.nextDouble());
                            minhaConta.deposito();
                            System.out.println("Seu saldo agora é de: R$" + dec.format(minhaConta.getSaldo()));
                        break;
                    case 2:
                            System.out.print("\nDigite o valor do saque: R$ ");
                            minhaConta.setValor(in.nextDouble());
                            try {
                                minhaConta.saque();
                                System.out.println("Seu saldo agora é de: R$" + dec.format(minhaConta.getSaldo()));
                            } catch (RuntimeException e) {
                                System.out.println("Erro : " + e.getMessage());
                                System.out.println("\nSeu saldo agora é de: R$" + dec.format(minhaConta.getSaldo()));
                            }
                        break;
                    case 3:
                            System.out.println("\nSeu saldo agora é de: R$" + dec.format(minhaConta.getSaldo()));
                            System.out.println("Saindo...");
                        break;
                    default:
                            System.out.println("Opção inválida");
                }
            } while (i != 3);
            
        in.close();
    }
}