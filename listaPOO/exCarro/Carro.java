package exCarro;

public class Carro {
    
    private String marca, modelo;
    private int velocidade;


        public String getMarca(){
            return marca;
        }

        public void setMarca(String mar){
            marca = mar;
        }

        public String getModelo(){
            return modelo;
        }

        public void setModelo(String mod){
            modelo = mod;
        }

        public int getVelocidade(){
            return velocidade;
        }

        public void setVelocidade( int v ){
            velocidade = v;
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
