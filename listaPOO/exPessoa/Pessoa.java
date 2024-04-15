package exPessoa;

public class Pessoa {
    
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String falar() {
        return "Oi, eu sou " + nome + " e tenho " + idade + " anos.";
    }
}
