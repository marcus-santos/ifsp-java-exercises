import javax.swing.JOptionPane;
import java.util.Random;

public class App {

    /*Crie um programa na linguagem Java que some cada uma das posições de dois vetores, 
    conforme o exemplo abaixo, e armazene o resultado em um terceiro vetor.  */

    public static void main(String[] args) throws Exception {
        
    int vetor1[] = new int[6];
    int vetor2[] = new int[6];
    int res[] = new int[6];
    int aux = 0;

    Random generator = new Random();
    
    for(int i = 1; i < 6; i++){
        vetor1[i] = generator.nextInt(10);
        vetor2[i] = generator.nextInt(10);
    }

    for(int i = 5; i >= 0 ; i--){

        res[i] = vetor1[i] + vetor2[i] + aux;

        if(res[i] >= 10){
            res[i] = res[i] % 10;
            aux = 1;
        }
        else aux = 0;
    }

    JOptionPane.showMessageDialog(null, vetor1[0] + "  " + vetor1[1] + "  " + vetor1[2] + "  " + 
    vetor1[3] + "  " + vetor1[4] + "  " + vetor1[5] + "\n" + vetor2[0]+ "  " + vetor2[1] + "  " + vetor2[2] + 
    "  " + vetor2[3] + "  " + vetor2[4] + "  " + vetor2[5] + "\n---------------------" + "\n" + res[0] + 
    "  " + res[1] + "  " + res[2] + "  " + res[3] + "  " + res[4] + "  " + res[5]);
    }
}