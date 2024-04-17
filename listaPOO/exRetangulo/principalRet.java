package exRetangulo;

import java.util.Scanner;

public class principalRet {
    public static void main(String[] args) {
        
        Retangulo ret = new Retangulo();
        Scanner in = new Scanner(System.in);

            System.out.print("Insira a altura do retângulo: ");
            ret.setAltura(in.nextDouble());

            System.out.print("\nInsira o lado do retângulo: ");
            ret.setLado(in.nextDouble());

            System.out.println("\n" + ret.exibir());
        
        in.close();
    }
}
