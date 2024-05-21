public class Carro {
    
    private String marca, modelo;
    private int velocidade;

    public void setMarca(String marca) throws IllegalArgumentException {
        if (marca == null || marca.isEmpty()) {
            throw new IllegalArgumentException("Marca inválida.");
        }
        this.marca = marca;
    }

    public void setModelo(String modelo) throws IllegalArgumentException {
        if (modelo == null || modelo.isEmpty()) {
            throw new IllegalArgumentException("Modelo inválido.");
        }
        this.modelo = modelo;
    }

    public void setVelocidade(int velocidade) throws IllegalArgumentException {
        if (velocidade < 0) {
            throw new IllegalArgumentException("Velocidade não pode ser negativa.");
        }
        this.velocidade = velocidade;
    }

    public int acelerar() {
        return velocidade += 10;
    }

    public int freiar() {
        if (velocidade >= 10) {
            return velocidade -= 10;
        } else {
            velocidade = 0;
            return velocidade;
        }
    }

    public String velocidadeAtual() {
        return "O " + modelo + " da marca " + marca + " está a " + velocidade + " Km/h agora";
    }
}