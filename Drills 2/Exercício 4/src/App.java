import javax.swing.JOptionPane;
import java.util.Random;

public class App {

    
    public static void main(String[] args) throws Exception {
        
    /*Faça  um  algoritmo  que  pegue  um  número  de  1  a  99  do  teclado  (ele  deve  impedir 
    entradas com valores fora da faixa). Depois o programa tenta "adivinhar" esse número, 
    sorteando  valores  quaisquer  nessa  faixa  (entre  1  e  99  positivos)  até  que  acerte,  por 
    acaso, aquele dado pelo usuário; então imprima o número de chutes até acertar. OBS: 
    Utilizar a classe java.util.Random para geração de números aleatórios em Java. */
    
    int num;
    int validate = 0;
    int count = 0;
    int rng = 0;

    Random gen = new Random();

    do{
        num = Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero entre 1 e 99: "));
        if(num < 1 || num > 99){
            JOptionPane.showMessageDialog(null, "Numero Invalido!");
        }
        else validate++;
    }while(validate != 1);

    while (rng != num) {
        rng = gen.nextInt(98) + 1;
        count++;
    }
    JOptionPane.showMessageDialog(null, "Seu numero foi: " + num + "\nAdvinhado em "+ count +" tentativas.");
}
}
