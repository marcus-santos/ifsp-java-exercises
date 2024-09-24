import javax.swing.JOptionPane;

public class Conta {
    private String conta;
    private double saldo;
    private double value;

    public void operation(){
        int choice = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para Extrato\n2 para Saque\n3 para Depósito\n4 para Finalizar"));
        if(choice == 1){
            
            extrato(conta, saldo);
        }
        else if(choice == 2){
            value = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do saque"));
            saque(saldo, value);
        }
        else if(choice == 3){
            value = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do deposito"));
            deposito(saldo, value);
        }
    }

    public void extrato(String conta, double saldo){
        JOptionPane.showMessageDialog(null, "Numero da Conta: " + conta + "\nSaldo Disponível: " + saldo);
        operation();
    }

    public void saque(double saldo, double saque){
        this.saldo = saldo - saque;
        JOptionPane.showMessageDialog(null, "Valor do Saque: " + saque + "\nSaldo Disponível: " + this.saldo);
        operation();
    }

    public void deposito(double saldo, double deposito){
        this.saldo = saldo + deposito;
        JOptionPane.showMessageDialog(null, "Valor do Depósito: " + deposito + "\nSaldo Disponível: " + this.saldo);
        operation();
    }

    public String getConta() {
        return conta;
    }
    
    public void setConta(String conta) {
        this.conta = conta;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
