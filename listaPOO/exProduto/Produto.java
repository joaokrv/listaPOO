
//•Um atributo ultimo_id, que irá armazenar o identificador do último produto criado. Ao criar um novo produto, atribua o valor deste atributo ao id do objeto criado, e incremente este contador em seguida. Este atributo deverá ser somente de leitura fora da classe.

//•Métodos get e set para acesso aos atributos da classe (para o atributo id, crie somente o método get. O valor deste atributo será alterado somente ao se criar um objeto da //classe. Para o método setPreco, valide o valor do preço. Caso seja negativo, atribua o valor 0 ao mesmo)

//•Construtor sem parâmetros, que atribua o id ao produto criado e que incremente o último id gerado, e que inicialize o preço do produto com 0 e o seu nome como “Nome não informado”

//•Construtor que receba o nome e preço do produto, e que execute o primeiro para atribuir o valor do id produto

//•Método exibe(), que exiba as informações do produto da seguinte forma:
//• Produto: nome do produto
//• Id: identificador do produto
//• Nome: nome do produto

//• Método reajustaPreco, que receba um percentual, e que atualize o preço do produto de acordo com o percentual

//• Para testar a sua classe, crie dois objetos desta classe. Para a criação desses //objetos, solicite ao usuário que informe o nome e preço do produto. Em seguida, solicite o valor de reajuste e imprima as informações do produto, juntamente com a informação do último id gerado.

import java.text.DecimalFormat;

public class Produto {

    DecimalFormat dec = new DecimalFormat("0.00");

    
    private int id;
    private static int ultimo_id = 0;
    private String nome;
    private double preco, porcentagem = 0;

        public Produto(String nome, double preco){
            
            this.id = ++ultimo_id;
            this.nome = nome;
            this.preco = preco;
            
        }
        
        public int getId() {
            return id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getPreco() {
            return preco;
        }
        
        public void setPreco(double preco) {
            if (preco >= 0) {
                this.preco = preco;
            } else {
                this.preco = 0;
            }
        }

        public double getReajuste(){
            return porcentagem;
        }

        public void setReajuste(double porcentagem){
            this.porcentagem = porcentagem;
        }

        public double reajustePreco() {
            return preco * (porcentagem/100 + 1);
        }
        
        public String exibir(){
            return "Id = "+ id +"\nNome = " + nome + "\nPreço = R$ " + dec.format(preco) + "\nPreço reajustado = R$ " + dec.format(reajustePreco());
        }
}
