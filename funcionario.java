public class funcionario {
    String nome;
    String cpf;
    int telefone;
    double salario;

    public funcionario(String nome, String cpf, int telefone, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.salario = salario;
    }

}
    public void exibirDados(){
        System.out.println("\nNome do funcionario: " + nome);
        System.out.println("Cpf do funcionario: " + cpf );
        System.out.println("Telefone do funcionario: " + telefone);
        System.out.printf("Salario do funcionario: R$ %.2f\n", salario );

    }

    public  void reajusteSalario(double aumento){
        System.out.println("\nMudando salario do funcionario: " + nome);
        System.out.printf("Antigo salario do funcionario: R$ %.2f\n", salario);
        salario+= aumento;
        System.out.printf("Novo salario do funcionario: R$ %.2f\n", salario);
    }

}
