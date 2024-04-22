package exAnimais;

public class Animal {
    
    private String nome;
    private int idade;

        public Animal(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String mover() {
            return nome + " está se movendo.";
        }

        public String seAlimentar() {
            return nome + " está se alimentando.";
        }

        public String fazerSom() {
            return nome + " está fazendo um som.";
        }

        public String getNome(){
            return nome;
        }

        public void setNome(String nome){
            this.nome = nome;
        }

        public int getIdade(){
            return idade;
        }

        public void setIdade(int idade){
            this.idade = idade;
        }
}
