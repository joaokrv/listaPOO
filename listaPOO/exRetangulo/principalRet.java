package exRetangulo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class principalRet {
    public static void main(String[] args) {
        
        retangulo ret = new retangulo();

        Scanner in = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("00.00");

            System.out.print("Insira a altura do retângulo: ");
            ret.setAltura(in.nextDouble());

            System.out.print("\nInsira o lado do retângulo: ");
            ret.setLado(in.nextDouble());

            System.out.println("\nA área do retângulo é: " + dec.format(ret.calculoAreaRet()));
            System.out.println("\nO perimetro do retângulo  é: " + dec.format(ret.calculoPerimetroRet()));
        
        in.close();
    }
}
