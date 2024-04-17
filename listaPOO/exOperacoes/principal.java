package exOperacoes;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Inteiros inteiro = new Inteiros(0, 0);
        
        int escolha;

        System.out.print("Digite o valor A: ");
        inteiro.setA(in.nextInt());

        System.out.print("Digite o valor B: ");
        inteiro.setB(in.nextInt());

        do {
            System.out.println("Insira qual operação deseja fazer:\n1 - Multiplicação de " + inteiro.getA() + " x " + inteiro.getB() + "\n2 - Divisão de " + inteiro.getA() + " : "+ inteiro.getB() + "\n3 - Potenciação de " + inteiro.getA() +" ^ " + inteiro.getB()+ "\n4 - Verificar se o número " + inteiro.getA() + " é par\n0 - Sair ");
            escolha = in.nextInt();

            switch (escolha) {
                case 1:
                    inteiro.multiplicacao(inteiro.getA(), inteiro.getB());
                    break;
                case 2:
                    inteiro.divisao(inteiro.getA(), inteiro.getB());
                    break;
                case 3:
                    System.out.println("Resultado da potenciação: " + inteiro.potencia(inteiro.getA(), inteiro.getB()));
                    break;
                case 4:
                    Inteiros.par(inteiro.getA());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
        } while (escolha != 0);
        
        in.close();
    }
}
