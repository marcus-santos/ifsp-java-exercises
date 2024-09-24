import javax.swing.JOptionPane;
import java.util.Random;

public class App {

    
    public static void main(String[] args) throws Exception {
        
    /*Jokenpô é um jogo de sorte simples onde o jogador deve escolher entre pedra, tesoura 
    e papel. As regras são: Pedra ganha da tesoura (amassando-a ou quebrando-a). Tesoura 
    ganha do papel (cortando-o). Papel ganha da pedra (embrulhando-a). Crie um algoritmo 
    que simule esse jogo entre usuário e computador. OBS: Utilizar a classe 
    java.util.Random para geração de números aleatórios em Java. */

    int you, machine;

    you = Integer.parseInt(JOptionPane.showInputDialog("Jogo da Velha! Digite:  \n0 para Pedra\n1 para Papel\n2 para Tesoura"));

    Random gen = new Random();
    machine = gen.nextInt(4);

    if((you == 0 && machine == 0)){
        JOptionPane.showMessageDialog(null, "Você jogou Pedra\nComputador jogou Pedra\nEmpate!");
    }

    else if((you == 0 && machine == 1)){
        JOptionPane.showMessageDialog(null, "Você jogou Pedra\nComputador jogou Papel\nVocê Perdeu!");
    }

    else if((you == 0 && machine == 2)){
        JOptionPane.showMessageDialog(null, "Você jogou Pedra\nComputador jogou Tesoura\nVocê Ganhou!");
    }

    else if((you == 1 && machine == 0)){
        JOptionPane.showMessageDialog(null, "Você jogou Papel\nComputador jogou Pedra\nVocê Ganhou!");
    }

    else if((you == 1 && machine == 1)){
        JOptionPane.showMessageDialog(null, "Você jogou Papel\nComputador jogou Papel\nEmpate!");
    }

    else if((you == 1 && machine == 2)){
        JOptionPane.showMessageDialog(null, "Você jogou Papel\nComputador jogou Tesoura\nVocê Perdeu!");
    }

    else if((you == 2 && machine == 0)){
        JOptionPane.showMessageDialog(null, "Você jogou Tesoura\nComputador jogou Pedra\nVocê Perdeu!");
    }

    else if((you == 2 && machine == 1)){
        JOptionPane.showMessageDialog(null, "Você jogou Tesoura\nComputador jogou Papel\nVocê Ganhou!");
    }

    else if((you == 2 && machine == 2)){
        JOptionPane.showMessageDialog(null, "Você jogou Tesoura\nComputador jogou Tesoura\nEmpate!");
    }
}
}
