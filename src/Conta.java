public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    // Static é da classe
    private static int total;

    // Construtor
    public Conta(int agencia, int numero) {
        Conta.total++;
        System.out.println("O total de contas é: " + total);
        this.agencia = agencia;
        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int numero) {
        if (numero <= 0) {
            System.out.println("Não é permitido numeros negativos!");
            return;
        }
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Não é permitido numeros negativos!");
            return;
        }
        this.numero = numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    // sem retorno
    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    // com retorno
    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    // com retorno
    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            destino.saldo = destino.saldo + valor;
            return true;
        }
        return true;
    }

    public static int getTotal() {
        return Conta.total;
    }
}