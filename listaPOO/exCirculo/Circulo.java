package exCirculo;

public class Circulo {
    
    private double raio, pi = 3.14;

    public Circulo(){
        raio = 0; pi = 3.14;
    }

    public double getRaio(){
        return(raio);
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

    public double calculoAreaCirc(){
        return pi * Math.pow(raio, 2);
    }

    public double calculoPerimetroCirc(){
        return 2 * pi * raio;
    }
}