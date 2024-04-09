public class principal{
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Pedro", 123, 18);
        Aluno aluno2 = new Aluno("Ana", 145, 22);

        System.out.println(aluno1.falar());
        System.out.println(aluno2.falar());
    }
}