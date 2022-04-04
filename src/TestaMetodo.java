public class TestaMetodo {

    public static void main(String[] args) {
        Conta joao = new Conta();
        joao.saldo = 100;
        System.err.println(joao.saldo);
        joao.deposita(50);
        System.out.println(joao.saldo);
    }
}