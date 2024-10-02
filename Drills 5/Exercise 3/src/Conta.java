public class Conta {
    double saldo = 3500;

    public double sacar(double saque){
        return saldo -= saque;
    }

    public double depositar(double deposito){
        return saldo += deposito;
    }

    public double obterSaldo(){
        return saldo;
    }
}
