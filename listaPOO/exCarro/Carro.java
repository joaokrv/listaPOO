package exCarro;

public class Carro {
    
    private String marca, modelo;
    private int velocidade;


        public String getMarca(){
            return marca;
        }

        public void setMarca(String marca){
            this.marca = marca;
        }

        public String getModelo(){
            return modelo;
        }

        public void setModelo(String modelo){
            this.modelo = modelo;
        }

        public int getVelocidade(){
            return velocidade;
        }

        public void setVelocidade( int velocidade){
            if (velocidade >= 0) {
                this.velocidade = velocidade;
            } else {
                this.velocidade = 0;
            }
            
        }

        public int acelerar(){
            return velocidade += 10;
        }

        public int freiar(){
            return velocidade -= 10;
        }

        public String velocidadeAtual(){
            return "O " + modelo + " da marca " + marca + " está a " + velocidade + " Km/h agora";
        }
}
