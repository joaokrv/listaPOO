package exEstoque;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
               
        Estoque produto1 = new Estoque(null, 0, 0);
        Estoque produto2 = new Estoque(null, 0, 0);
        Estoque produto3 = new Estoque(null, 0, 0);
        
            System.out.println("\nInsira aqui o nome do produto: ");
            produto1.setNome(in.next());

            System.out.println("\nInsira aqui o valor do produto: ");
            produto1.setValor(in.nextDouble());

            System.out.println("\nInsira aqui a quantidade: ");
            produto1.setQtde(in.nextInt());

            System.out.println("\n" + produto1.mostrar());

            System.out.println("\nInsira aqui o nome do produto: ");
            produto2.setNome(in.next());
            
            System.out.println("\nInsira aqui o valor do produto: ");
            produto2.setValor(in.nextDouble());

            System.out.println("\nInsira aqui a quantidade: ");
            produto2.setQtde(in.nextInt());
            
            System.out.println("\n" + produto2.mostrar());

            System.out.println("\nInsira aqui o nome do produto: ");
            produto3.setNome(in.next());
            
            System.out.println("\nInsira aqui o valor do produto: ");
            produto3.setValor(in.nextDouble());

            System.out.println("\nInsira aqui a quantidade: ");
            produto3.setQtde(in.nextInt());
            
            System.out.println("\n" + produto3.mostrar());

        in.close();
    }
}