package exAnimais;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
            Mamifero mamifero1 = new Mamifero(null, 0, null);
            Aves ave1 = new Aves(null, 0, 0);
            Reptil reptil1 = new Reptil(null, 0, null);

            System.out.println("Digite aqui qual tipo de animal será inserido:\n1 - Mamífero\n2 - Ave\n3 - Réptil");
            int i = in.nextInt();
            
            switch (i) {
                case 1:
                    
                    System.out.println("Digite o nome do animal: ");
                    mamifero1.setNome(in.next());
                    
                    System.out.println("\nDigite a idade do animal: ");
                    mamifero1.setIdade(in.nextInt());
                    
                    System.out.println("\nDigite o tipo de pelo: ");
                    mamifero1.setPelo(in.next());

                    mamifero1.exibir();
                    
                    break;
                case 2:
                                    
                    System.out.println("Digite o nome do animal: ");
                    ave1.setNome(in.next());
                    
                    System.out.println("\nDigite a idade do animal: ");
                    ave1.setIdade(in.nextInt());
                    
                    System.out.println("\nDigite o tamanho das asas em CM: ");
                    ave1.setTamanhoAsas(in.nextInt());

                    ave1.exibir();
                
                    break;
                case 3:
                                    
                    System.out.println("Digite o nome do animal: ");
                    reptil1.setNome(in.next());
                    
                    System.out.println("\nDigite a idade do animal: ");
                    reptil1.setIdade(in.nextInt());
                    
                    System.out.println("\nDigite a textura da pele: ");
                    reptil1.setTextura(in.next());

                    reptil1.exibir();
            
                    break;
                default:
                    
                    System.out.println("O número digitado é inválido");
                    
                    break;
            }
        
        in.close();
    }
}
