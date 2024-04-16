import java.util.Scanner;

public class principal{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Transacao transacaoConta1 = new Transacao();
        Conta conta1 = new Conta();

            System.out.println("Digite aqui seu ID de conta: ");
            conta1.setId(in.nextInt());

            System.out.println("Digite o valor da transação: ");
            transacaoConta1.setValor(in.nextDouble());

            transacaoConta1.efetuarTransacao();

        in.close();
    }
}