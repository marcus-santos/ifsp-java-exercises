import javax.swing.JOptionPane;

public class App {

    /*Crie  uma  classe  que  representa  uma  conta  bancaria  que  possua  o  número  da 
    conta e saldo. Está classe também deve executar os seguintes métodos: 
    
    a) extrato (Mostra na tela o número e o saldo da conta) 
    b) saque (Recebe como parâmetro um valor e retira este valor do saldo da 
    conta) 
    c) deposito (recebe como parâmetro um valor e adiciona este valor ao saldo 
    da conta) 
    Ao final das operações saque e deposito, sua classe deve imprimir o número e o 
    saldo da conta. Crie uma classe para testar os métodos da classe conta bancaria.  */

    public static void main(String[] args) throws Exception {
        
        Conta itau = new Conta();

        itau.setConta(JOptionPane.showInputDialog("Insira o número da conta"));
        itau.setSaldo(Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o Saldo")));

        itau.operation();

    }
}
