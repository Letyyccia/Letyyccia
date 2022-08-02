import java.util.Scanner;

public class cliente {
    String nome;
    String cpf;
    int telefone;
    produto produtos;

    Scanner sc = new Scanner(System.in);
    
    //metodo construtor
    public cliente(String nome, String cpf, int telefone, produto produtos) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.produtos = produtos;
    }
    public void exibirDados(){
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Cpf do cliente: " + cpf );
        System.out.println("Telefone do cliente: " + telefone);
        System.out.println("Produtos comprados pelo cliente: " + produtos.nome);
    }

    public void avaliacao(){
        System.out.println("\nEscreva sua avaliação da loja");
        sc.nextLine();
        System.out.println("Avaliação recebida!");
    }
}

