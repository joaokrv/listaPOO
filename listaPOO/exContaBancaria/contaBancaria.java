package exContaBancaria;


public class contaBancaria {
    
    private int numConta;
    private String nomeTitular;
    private double saldoConta, valor;

        public contaBancaria(){
            numConta = 0; saldoConta = 0; nomeTitular = null; valor = 0;
        }

        public int getNumConta(){
            return (numConta);
        }

        public void setNumConta(int numero){
            numConta = numero;
        }

        public String getNomeTitular(){
            return (nomeTitular);
        }

        public void setNomeTitular(String nome){
            nomeTitular = nome;
        }

        public double getSaldo(){
            return (saldoConta);
        }

        public double getValor(){
            return (valor);
        }

        public void setValor(double val){
            valor = val;
        }

        public double depoisto(){
            return saldoConta = saldoConta + valor;
            
        }

        public double saque(){
            return saldoConta = saldoConta - valor;
        }
}
// número da conta, nome do titular e saldo. Adicione métodos para realizar depósitos e saques