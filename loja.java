public class loja {
    public static void main (String[] args){
        funcionario f1 = new funcionario("João", "014.205.145-78", 40028922, 2000);
        funcionario f2 = new funcionario("Maria", "789.156.432-78", 999996314, 1500);

        produto p1 = new  produto("Sapato", 123, 100, f1);
        produto p2 = new  produto("Tenis", 456, 200, f2);

        cliente c1 = new  cliente("Yasmim", "456.123.148-96", 99864580, p2);
        cliente c2 = new  cliente("Witalo", "456.789.123-20", 999999999, p1);


        System.out.println("Dados dos clientes cadastrados: ");
        c1.exibirDados();
        c2.exibirDados();

        System.out.println("--------------------------------------");

        System.out.println("\nDados dos funcionarios cadastrados: ");
        f1.exibirDados();
        f2.exibirDados();

        System.out.println("--------------------------------------");

        System.out.println("\nDados dos produtos cadastrados: ");
        p1.exibirDados();
        p2.exibirDados();

        System.out.println("--------------------------------------");


        f2.reajusteSalario(100);

        p1.aumentoValor(25);
        p2.descontoValor(60);

        c1.avaliacao();
    }
}
