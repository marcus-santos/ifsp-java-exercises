import javax.swing.JOptionPane;

public class App {

    /*Faça um programa que leia um número inteiro positivo de três dígitos (de 100 até 999). 
    Gere outro número formado pelos dígitos invertidos do número lido.  
    OBS: Não devem ser utilizados comandos e/ou funções que ainda não foram abordadas, tais 
    como: laços de decisão, laços de repetição, etc. */

    public static void main(String[] args) throws Exception {
    int total, centena, dezena, unidade;

    total = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero entre 100 e 999."));

    centena = total/100;
    dezena = (total % 100) /10;
    unidade = (total % 100) % 10;

    JOptionPane.showMessageDialog(null,unidade+""+ dezena+""+ centena);

}
}