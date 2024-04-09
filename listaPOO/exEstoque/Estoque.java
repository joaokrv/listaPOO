package exEstoque;
import java.text.DecimalFormat;

public class Estoque {
    
    DecimalFormat dec = new DecimalFormat("00.00");

    private int qtde;
    private String nome;
    private double valor;

        public Estoque(String nome, double valor, int qtde){
            this.nome = nome;
            this.valor = valor;
            this.qtde = qtde;
        }

        public String getNome(){
            return nome;
        }

        public double getValor(){
            return valor;
        }

        public int getQtde(){
            return qtde;
        }

        public double valorTotalProduto(){
            return valor * qtde;
        }

        public String verificarEstoque(){
            if (qtde <= 0) {
                return "Produto indisponível ";
            } else {
                return "Produto disponível com " + qtde + " unidades";
            }
        }

        public String mostrar(){
            return "Produto: " + nome + "\nDisponibilidade: " + verificarEstoque() + "\nValor produto: R$ " + dec.format(valor) + "\nValor Total: R$ " + dec.format(valorTotalProduto());
        }
}   
