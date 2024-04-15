import java.util.Scanner;

public class principal{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        produto p1 = new produto("Produto 1", 0);
        produto p2 = new produto("Produto 2", 0);
        produto p3 = new produto("Produto 3", 0);
            
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