public class app{
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa("Joao", 20);
        Pessoa pessoa2 = new Pessoa("Maria", 23);

        Aluno aluno1 = new Aluno("Pedro", 123, 18);
        Aluno aluno2 = new Aluno("Ana", 145, 22);

        System.out.println(pessoa1.falar());
        System.out.println(pessoa2.falar());

        System.out.println(aluno1.falar());
        System.out.println(aluno2.falar());
    }
}