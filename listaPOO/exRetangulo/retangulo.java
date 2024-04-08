package exRetangulo;

public class retangulo {
    
    private double altura, lado;

    public retangulo(){
        altura = 0; lado = 0;
    }

    public double getAltura(){
        return (altura);
    }

    public void setAltura(double alt){
        altura = alt;
    } // void porque será utilizado no programa principal e nao retornará nenhum valor

    public double getLado(){
        return (lado);
    }

    public void setLado(double l){
        lado = l;
    }

    public double calculoAreaRet(){
        return lado * altura;
    }

    public double calculoPerimetroRet(){
        return 2 * (lado + altura);
    }
}
