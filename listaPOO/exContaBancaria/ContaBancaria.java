package exContaBancaria;


public class ContaBancaria {
    
    private int numConta;
    private String nomeTitular;
    private double saldoConta, valor;

        public ContaBancaria(){
            numConta = 0; saldoConta = 0; nomeTitular = null; valor = 0;
        }

        public int getNumConta(){
            return (numConta);
        }

        public void setNumConta(int numConta){
            this.numConta = numConta;
        }

        public String getNomeTitular(){
            return (nomeTitular);
        }

        public void setNomeTitular(String nomeTitular){
            this.nomeTitular = nomeTitular;
        }

        public double getSaldo(){
            return (saldoConta);
        }

        public double getValor(){
            return (valor);
        }

        public void setValor(double valor){
            this.valor = valor;
        }

        public double deposito(){
            return saldoConta += valor; 
        }

        public double saque() {
            if (valor >= 1000) {
                throw new RuntimeException("Não é possível fazer um saque maior que R$ 1.000,00.");
            }
            else if (saldoConta < valor) {
                throw new RuntimeException("Saldo insuficiente para saque");
            }
            return saldoConta -= valor;
        }
}
// número da conta, nome do titular e saldo. Adicione métodos para realizar depósitos e saques