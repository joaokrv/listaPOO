package exTransicaoBancaria;

public class Conta {

    private int id;
    private double saldo = 0;
    private String nome;

    public Conta(String nome, int id, double saldo) {
        this.id = id;
        this.saldo = saldo;
        this.nome = nome;
    }

    public int getId(){
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void credito(double valor) {
        saldo += valor;
        System.out.println("Operação realizada com sucesso.");
    }

    public void debito(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Operação realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para débito.");
        }
    }
}