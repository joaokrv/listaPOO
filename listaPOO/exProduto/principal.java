import java.util.Scanner;

public class principal{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        Produto p1 = new Produto("Produto 1", 0);
        Produto p2 = new Produto("Produto 2", 0);
        Produto p3 = new Produto("Produto 3", 0);
            
            System.out.println("\nInsira aqui o nome do produto: ");
            p1.setNome(in.next());

            System.out.println("\nInsira aqui o preço do produto: ");
            p1.setPreco(in.nextDouble());

            System.out.println("\nInsira o percentual do reajuste: ");
            p1.setReajuste(in.nextDouble());

            System.out.println("\n" + p1.exibir());

            System.out.println("\nInsira aqui o nome do produto: ");
            p2.setNome(in.next());

            System.out.println("\nInsira aqui o preço do produto: ");
            p2.setPreco(in.nextDouble());

            System.out.println("\nInsira o percentual do reajuste: ");
            p2.setReajuste(in.nextDouble());
            
            System.out.println("\n" + p2.exibir());

            System.out.println("\nInsira aqui o nome do produto: ");
            p3.setNome(in.next());

            System.out.println("\nInsira aqui o preço do produto: ");
            p3.setPreco(in.nextDouble());

            System.out.println("\nInsira o percentual do reajuste: ");
            p3.setReajuste(in.nextDouble());

            System.out.println("\n" + p3.exibir());
        
        in.close();
    
    }
}