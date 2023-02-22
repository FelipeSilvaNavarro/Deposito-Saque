package exercicios.banco.entidades;

public class Conta {

    private double saldo;
    private  int conta;
    private  String nome;

    public Conta(double depositoInicial, int conta, String nome) {
        addSaldo(depositoInicial);
        this.conta = conta;
        this.nome = nome;
    }

    public Conta(int conta, String nome) {
        this.conta = conta;
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getConta() {
        return conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void addSaldo(double valor) {
        saldo += valor;
    }
    // O banco cobra uma taxa de R$5,00 por saque
    public  void remSaldo(double valor) {
        saldo -= valor + 5.0;
    }

    @Override
    public String toString() {
        return "Conta: " + conta +
                ", Nome: " + nome +
                ", Saldo: R$" + String.format("%.2f", saldo);
    }
}



