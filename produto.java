public class produto {
    String nome;
    int codigo;
    double valor;
    funcionario vendas;

    public produto(String nome, int codigo, double valor, funcionario vendas) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
        this.vendas = vendas;
    }

    public void exibirDados(){
        System.out.println("\nNome do produto: " + nome);
        System.out.println("Codigo do produto: " + codigo);
        System.out.printf("Valor do produto: R$ %.2f\n", valor);
        System.out.println("Funcionario que vendeu o produto: " + vendas.nome);
    }

    public  void aumentoValor(double aumento){
        System.out.println("\nMudando valor do produto: " + nome);
        System.out.printf("Antigo valor do produto: R$ %.2f\n", valor);
        valor+= aumento;
        System.out.printf("Novo valor do produto: R$ %.2f\n", valor);
    }

    public  void descontoValor(double desconto){
        System.out.println("\nMudando valor do produto: " + nome);
        System.out.printf("Antigo valor do produto: R$ %.2f\n", valor);
        valor-= desconto;
        System.out.printf("Novo valor do produto: R$ %.2f\n", valor);
    }

}
