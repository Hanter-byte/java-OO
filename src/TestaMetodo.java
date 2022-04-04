public class TestaMetodo {

    public static void main(String[] args) {
        Conta joao = new Conta();


        joao.saldo = 100;
        /*
         * System.err.println(joao.saldo);
         * joao.deposita(50);
         * System.out.println(joao.saldo);
         * joao.saca(60);
         * System.out.println(joao.saldo);
         */

        Conta pedro = new Conta();
        pedro.saldo = 5000;
        System.out.println("Saldo pedro: " + pedro.saldo);
        System.out.println("Saldo joao: " + joao.saldo);
        pedro.transfere(500, joao);
        System.out.println("Saldo pedro: " + pedro.saldo);
        System.out.println("Saldo joao: " + joao.saldo);
    }
}