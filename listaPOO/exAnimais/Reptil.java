package exAnimais;

public class Reptil extends Animal {

    private String texturaPele;
    
        Reptil(String nome, int idade, String texturaPele){
            super(nome, idade);
            this.texturaPele = texturaPele;
        }

        public String tomarSol() {
            return getNome() + " está tomando sol para regular sua temperatura.";
        }

        public String getTextura(){
            return texturaPele;
        }

        public void setTextura(String texturaPele){
            this.texturaPele = texturaPele;
        }

        public void exibir(){
            System.out.println("\nO réptil " + getNome() + " possui " + getIdade() + " anos de idade.\n" + mover() + "\n" + seAlimentar() + "\n" + fazerSom() +"\nSua pele é " + getTextura() + ".\nAgora " + tomarSol());
        }
}
