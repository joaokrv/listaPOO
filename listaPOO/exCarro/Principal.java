package exCarro;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Carro carro1 = new Carro();

            System.out.print("Qual carro você quer? ");
            carro1.setModelo(in.nextLine());

            System.out.print("De qual marca ele é? ");
            carro1.setMarca(in.nextLine());

            System.out.print("Digite a velocidade inicial do carro: ");
            carro1.setVelocidade(in.nextInt());

            System.out.print("Caso queira acelerar digite A, caso queira freiar digite B: ");
            char modo = in.next().charAt(0);
            
            if (modo == 'A'){
                carro1.acelerar();
                System.out.println("\n" + carro1.velocidadeAtual());
            } else if (modo == 'B'){
                carro1.freiar();
                System.out.println("\n" + carro1.velocidadeAtual());
            }
            
            for ( int i = 0 ; i <= 1; ){

                System.out.print("\nCaso queira acelerar ou freiar mais digite 0, senão digite 2: ");
                i = in.nextInt();

                if (i == 2){
                    System.out.println("\n" + carro1.velocidadeAtual());
                    break;
                }

                System.out.print("Para acelerar digite A, caso queira freiar digite B: ");
                modo = in.next().charAt(0);
                
                if (modo == 'A'){
                    carro1.acelerar();
                    System.out.println("\n" + carro1.velocidadeAtual());
                } else if (modo == 'B'){
                    carro1.freiar();
                    System.out.println("\n" + carro1.velocidadeAtual());
                }
            }

        in.close();
    }
}
