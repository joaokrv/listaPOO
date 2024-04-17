package exAluno3;
import java.text.DecimalFormat;

public class Aluno {
    
    private String nome;
    private int ra;
    private double nota1, nota2, nota3;
    
    
    DecimalFormat dec = new DecimalFormat("0.00");

        public Aluno(String nome, int ra, double nota1, double nota2, double nota3){
            this.nome = nome;
            this.ra = ra;
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.nota3 = nota3;
        }

        public String getNome(){
            return nome;
        }

        public void setNome(String nome){
            this.nome = nome;
        }

        public int getRa(){
            return ra;
        }

        public void setRa(int ra){
            this.ra = ra;
        }

        public double getNota1(){
            return nota1;
        }
        
        public void setNota1(double nota1){
            if (nota1 <= 10 & nota2 >= 0) {
                this.nota1 = nota1;
            } else {
                System.out.println("Nota Inválida.");
            }
        }
        
        public double getNota2(){
            return nota2;
        }

        public void setNota2(double nota2){
            if (nota2 <= 10 & nota2 >= 0) {
                this.nota2 = nota2;
            } else {
                System.out.println("Nota Inválida.");
            }
        }
        
        public double getNota3(){
            return nota3;
        }

        public void setNota3(double nota3){
            if (nota3 <= 10 & nota2 >= 0) {
                this.nota3 = nota3;
            } else {
                System.out.println("Nota Inválida.");
            }
        }

        public double mediaNotas(){
            return (nota1 + nota2 + nota3)/ 3;
        }

        public double totalNotas(){
            return nota1 + nota2 + nota3;
        }

        public String verificarMedia(){
            if (mediaNotas() >= 7) {
                return "Você foi aprovado.";
            } else {
                return "Você foi reprovado";
            }
        }

        public String apresentar(){
            return "Aluno: " + nome + "\nRA: " + ra + "\nNota 1: " + nota1 + "\nNota 2: " + nota2 + "\nNota 3: " + nota3 + "\nMédia por prova: " + dec.format(mediaNotas()) + "\nTotal notas: " + dec.format(totalNotas()) + "\n" + verificarMedia(); 
        }
}

