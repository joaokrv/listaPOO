package exEstoque;



public class Principal {
    public static void main(String[] args) {
               
        Estoque produto1 = new Estoque("Produto 1", 2, 2);
        Estoque produto2 = new Estoque("Produto 2", 2.5, 2);
        Estoque produto3 = new Estoque("Produto 3", 2.5, 2);
        
        System.out.println("\n" + produto1.mostrar());
        System.out.println("\n" + produto2.mostrar());
        System.out.println("\n" + produto3.mostrar());

    }
}