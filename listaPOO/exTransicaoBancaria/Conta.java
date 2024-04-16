public class Conta {
    
    private int id;
    private double saldo = 0;

        public double getSaldo(){
            return saldo;
        }
        
        public int getId(){
            return id;
        }

        public void setId( int id ){
            this.id = id;
        }
        
        public void credito(double saldo){
            this.saldo = saldo;
       }

        public boolean debito(double saldo){
            if(saldo < 0){
                return false;
            } else {
                return true;
            }
        }
}
