public class TestaMetodo {

    public static void main(String[] args) {
        
        Conta contajoao = new Conta();
        contajoao.titular = new Cliente();
        contajoao.titular.nome = "João Pedro Nogueira";
        contajoao.titular.cpf = "123.434.545-20";
        contajoao.titular.profissao = "Developer";
        contajoao.saldo = 100;

        Conta pedro = new Conta();
        pedro.titular = new Cliente();
        pedro.titular.nome = "Pedro";
        pedro.titular.cpf = "987.434.445-20";
        pedro.titular.profissao = "Developer";
        pedro.saldo = 5000;

        System.out.println("Saldo pedro: " + pedro.saldo);
        System.out.println("Saldo joao: " + contajoao.saldo);
        pedro.transfere(500, contajoao);
        System.out.println("Saldo pedro: " + pedro.saldo);
        System.out.println("Saldo joao: " + contajoao.saldo);
    }
}