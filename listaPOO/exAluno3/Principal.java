package exAluno3;

public class Principal {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");

        aluno aluno1 = new aluno("João", 123456, 25, 30, 35);
        aluno aluno2 = new aluno("Maria", 654321, 20, 30, 40);

        System.out.println(aluno1.apresentar());
        System.out.println("\n" + aluno2.apresentar());

    }
}