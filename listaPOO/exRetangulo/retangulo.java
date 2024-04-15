package exRetangulo;

import java.text.DecimalFormat;

public class retangulo {
    
    DecimalFormat dec = new DecimalFormat("00.00");
    private double altura, lado;

    public retangulo(){
        altura = 0; lado = 0;
    }

    public double getAltura(){
        return (altura);
    }

    public void setAltura(double altura){
        this.altura = altura;
    } // void porque será utilizado no programa principal e nao retornará nenhum valor

    public double getLado(){
        return (lado);
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double calculoAreaRet(){
        return lado * altura;
    }

    public double calculoPerimetroRet(){
        return 2 * (lado + altura);
    }

    public String exibir(){
        return "Área Retângulo = " + dec.format(calculoAreaRet()) + "\nPerímetro Retângulo = " + dec.format(calculoPerimetroRet());
    }
}
