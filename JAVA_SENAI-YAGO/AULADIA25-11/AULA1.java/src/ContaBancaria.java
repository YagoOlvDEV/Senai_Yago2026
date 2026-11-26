public class ContaBancaria {
    public String titular;
    public int agencia;
    public int numeroConta;
    public double saldo;

    public ContaBancaria(String titular, int agencia, int numeroConta) {
        this.titular = titular;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }
    public void consultarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
}
