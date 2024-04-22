package exAnimais;

public class Mamifero extends Animal {

    private String pelo;
    
        Mamifero(String nome, int idade, String pelo){
            super(nome, idade);
            this.pelo = pelo;
        }

        public String amamentar(){
            return getNome() + " está amamentando.";
        }

        public String getPelo(){
            return pelo;
        }

        public void setPelo(String pelo){
            this.pelo = pelo;
        }
        
        public void exibir(){
            System.out.println("\nO mamífero " + getNome() + " possui " + getIdade() + " anos de idade.\n" + mover() + "\n" + seAlimentar() + "\n" + fazerSom() +"\nSeu pelo é " + getPelo() + ".\nAgora " + amamentar());
        }
}
