//Métodos:
//- int multiplicacao(int a, int b): retorna a multiplicação de a por b (utilize somente a operação de soma para este cálculo)
//- int potencia(int a, int b): retorna a elevado a b (utilize o método multiplicacao para este cálculo)
//- int divisao(int a, int b): retorna o valor inteiro da divisão de a por b (utilize somente a operação de subtração para este cálculo)
//-boolean par(int a): retorna true se a for par; e false, caso contrário (utilize o método resto para este cálculo)

//Para testar a sua classe, exiba o seguinte menu para o usuário:
//1 – Multiplicação
//2 – Potência
//3 – Divisão
//4 – Par
//5 – Sair

//De acordo com a opção, solicite ao usuário os valores para o cálculo

import java.text.DecimalFormat;

public class Inteiros {
    
    DecimalFormat dec = new DecimalFormat("00.00");

    private int a, b;

        public Inteiros (int a, int b){
            this.a = a;
            this.b = b;
        }

        public int getA(){
            return a;
        }

        public void setA(int a){
            this.a = a;
        }

        public int getB(){
            return b;
        }

        public void setB(int b){
            this.b = b;
        }

        public double multiplicacao(){
            return a * b;
        }

        public double divisao(){
            return a / b;
        }

        public double potencia(){
            return a * a * b;
        }

        public boolean par(){
            return a % 2 == 0;
        }

}
