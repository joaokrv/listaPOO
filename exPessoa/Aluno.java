public class Aluno {
    
    private String nome;
    private int idade, ra;

    public Aluno(String nome, int ra, int idade){
        this.nome = nome;
        this.idade = idade;
        this.ra = ra;
    }

    public int getRa(){
        return ra;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String falar() {
        return "Oi, eu sou " + nome + ", meu RA é " + ra + " e tenho " + idade + " anos.";
    }
}