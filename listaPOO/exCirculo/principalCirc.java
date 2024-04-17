package exCirculo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class principalCirc {
    public static void main(String[] args) {
        
        Circulo cir = new Circulo();

        Scanner in = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("00.00");

            System.out.print("Insira o valor do raio do circulo: ");
            cir.setRaio(in.nextDouble());

            System.out.println("A área do circulo é: " + dec.format(cir.calculoAreaCirc()));
            System.out.println("O perimetro do circulo: " + dec.format(cir.calculoPerimetroCirc()));
        
        in.close();
    }
}
