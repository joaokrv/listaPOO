package exOperacoes;

public class Inteiros {
    private int a, b;
    private int resultado = 0;
    private int i;

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

    public void multiplicacao(int a, int b){
        resultado = 0;
        for (i = 0 ; i < b ; i++){
            resultado += a;
        }
        System.out.println(a + " x " + b + " = " + resultado);
    }

    public void divisao(int a, int b){
        if (b == 0) {
            System.out.println("Divisão por zero não é permitida.");
            return;
        }
    
        int quociente = 0;
        int restante = a;
    
        while (restante >= b) {
            restante -= b;
            quociente++;
        }
    
        System.out.println(a + " : " + b + " = " + quociente + " com resto " + restante);
    }

    public int potencia(int a, int b){
        resultado = 0;
        int resultadoPotencia = 1;
        for (int i = 0; i < b; i++) {
            resultadoPotencia *= a;
        }
        return resultadoPotencia;
    }

    public static int resto(int a, int b) {
        while (a >= b) {
            a -= b;
        }
        return a;
    }

    public static boolean par(int a) {
        if (resto(a, 2) == 0) {
            System.out.println("O número " + a + " é par.");
            return true;
        } else {
            System.out.println("O número " + a + " não é par.");
            return false;
        }
    }
}