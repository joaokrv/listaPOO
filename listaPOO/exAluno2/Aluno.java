package exAluno2;
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

            public int getRa(){
                return ra;
            }

            public double getNota1(){
                return nota1;
            }
            
            public double getNota2(){
                return nota2;
            }
            
            public double getNota3(){
                return nota3;
            }

            public double totalNotas(){
                return nota1 + nota2 + nota3;
            }

            public String apresentar(){
                return "Aluno: " + nome + "\nRA: " + ra + "\nNota 1: " + nota1 + "\nNota 2: " + nota2 + "\nNota 3: " + nota3 + "\nTotal notas: " + dec.format(totalNotas()); 
            }
}
