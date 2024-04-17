package exTransicaoBancaria;

import java.sql.Date;

public class Transacao {

    private Date data;
    private double valor;
    private Conta contaCredito;
    private Conta contaDebito;

    public Transacao(double valor, Conta contaCredito, Conta contaDebito) {
        this.valor = valor;
        this.contaCredito = contaCredito;
        this.contaDebito = contaDebito;
    }

    public boolean efetuarTransacao() {
        if (valor <= contaDebito.getSaldo()) {
            contaDebito.debito(valor);
            contaCredito.credito(valor);
            System.out.println("Transferência de R$ " + valor + " realizada de " + contaDebito.getNome() + " para " + contaCredito.getNome());
            return true;
        } else {
            System.out.println("Saldo insuficiente para transferência.");
            return false;
        }
    }
}