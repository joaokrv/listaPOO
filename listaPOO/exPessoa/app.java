package exPessoa;

public class app{
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa("Joao", 20);
        Pessoa pessoa2 = new Pessoa("Maria", 23);

        System.out.println(pessoa1.falar());
        System.out.println(pessoa2.falar());

    }
}