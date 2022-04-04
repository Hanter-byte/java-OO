public class Conta {

    double saldo;
    int agencia;
    int numero;
    Cliente titular;

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
}