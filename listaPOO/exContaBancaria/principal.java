package exContaBancaria;

import java.text.DecimalFormat;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        
        contaBancaria minhaConta = new contaBancaria();

        Scanner in = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("00.00");

            System.out.print("Insira aqui seu nome: ");
            minhaConta.setNomeTitular(in.nextLine());

            System.out.print("Digite aqui o número da sua conta: ");
            minhaConta.setNumConta(in.nextInt());

            System.out.print("Seu saldo é de: R$" + dec.format(minhaConta.getSaldo()));

            System.out.print("\nCaso queira fazer um depósito digite o valor aqui, senão digite 0: ");
            minhaConta.setValor(in.nextDouble());
            minhaConta.depoisto();
            
            System.out.print("\nCaso queira fazer um saque digite o valor aqui, senão digite 0: ");
            minhaConta.setValor(in.nextDouble());
            minhaConta.saque();
            
            System.out.println("Seu saldo agora é de: R$" + dec.format(minhaConta.getSaldo()));
        
        in.close();
    }
}

//Implemente uma classe chamada “ContaBancária” que possua atributos para armazenar o número da conta, nome do titular e saldo. Adicione métodos para realizar depósitos e saques