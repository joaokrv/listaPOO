package exAnimais;

public class Aves extends Animal{
    
    private int tamanhoAsas;

    public Aves(String nome, int idade, int tamanhoAsas) {
        super(nome, idade);
        this.tamanhoAsas = tamanhoAsas;
    }

    public String voar() {
        return getNome() + " está voando com suas asas.";
    }

    public int getTamanhoAsas() {
        return tamanhoAsas;
    }

    public void setTamanhoAsas(int tamanhoAsas) {
        this.tamanhoAsas = tamanhoAsas;
    }

    public void exibir(){
        System.out.println("\nA ave " + getNome() + " tem " + getIdade() + " anos.\n" + mover() + "\n" + seAlimentar() + "\n" + fazerSom() +"\nAgora " + voar() + "\nO tamanho da asa dessa ave é de " + getTamanhoAsas() + "cm .");
    }
}

