package exAluno3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

        Aluno aluno1 = new Aluno(null, 0, 0, 0, 0);
        Aluno aluno2 = new Aluno(null, 0, 0, 0, 0);

        System.out.println("Insira o nome do aluno: ");
        aluno1.setNome(in.next());
        System.out.println("\nInsira o RA do aluno: ");
        aluno1.setRa(in.nextInt());
        System.out.println("\nInsira a primeira nota: ");
        aluno1.setNota1(in.nextDouble());
        System.out.println("\nInsira a segunda nota: ");
        aluno1.setNota2(in.nextDouble());
        System.out.println("\nInsira a terceira nota: ");
        aluno1.setNota3(in.nextDouble());

        System.out.println("\n" + aluno1.apresentar());

        System.out.println("\nInsira o nome do aluno: ");
        aluno2.setNome(in.next());
        System.out.println("\nInsira o RA do aluno: ");
        aluno2.setRa(in.nextInt());
        System.out.println("\nInsira a primeira nota: ");
        aluno2.setNota1(in.nextDouble());
        System.out.println("\nInsira a segunda nota: ");
        aluno2.setNota2(in.nextDouble());
        System.out.println("\nInsira a terceira nota: ");
        aluno2.setNota3(in.nextDouble());
        System.out.println("\n" + aluno2.apresentar());
    
    in.close();

    }
}
