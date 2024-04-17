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

        public double depoisto(){
            return saldoConta = saldoConta + valor;
            
        }

        public double saque(){
            return saldoConta = saldoConta - valor;
        }
}
// número da conta, nome do titular e saldo. Adicione métodos para realizar depósitos e saques