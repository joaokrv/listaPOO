import java.util.Date;

public class Transacao {

    Conta contaCredito = new Conta();
    Conta contaDebito = new Conta();
    
    private double valor;
    private Date Data;
    private int i;
    private double saldoAtual = contaDebito.getSaldo();
    private double saldoAtualCredito = contaCredito.getSaldo();

        public int getI(){
            return i;
        }

        public void setI(int i){
            this.i = i;
        }

        public double getValor(){
            return valor;
        }

        public void setValor(double valor){
            this.valor = valor;
        }

        public void creditar(){
            contaCredito.credito(valor);
            saldoAtualCredito = contaCredito.getSaldo() + valor;
            System.out.println("Você creditou o valor de: R$ " + saldoAtualCredito);
        }
        
        public void debitar(){
            contaDebito.debito(saldoAtual);
            if (contaDebito.debito(saldoAtual) == true) {
                saldoAtual = contaDebito.getSaldo() - valor;
                System.out.println("Você debitou o valor de: R$ " + saldoAtual);
                saldoAtual = contaDebito.getSaldo() - valor;
            } if (saldoAtual <= 0){
                System.out.println("A transação falhou.");
            }
        }

        public boolean efetuarTransacao(){
            if (contaDebito.debito(saldoAtual) == true) {
                creditar();
                debitar();
                System.out.println("A conta de ID " + contaCredito.getId() + " recebeu o valor de R$ " + saldoAtualCredito);
                return true;
            } else {
                return false;
            }
            //if (i == 1) {
            //    creditar();
            //    return true;
            //} else if (i == 2) {
            //    debitar();
            //    return true;
            //} else {
            //    return false;
            //}
        }
}
