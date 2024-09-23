import java.util.Random;
import javax.swing.JOptionPane;

public class App {

    /*Em  teoria  de  sistemas,  define-se  como  elemento  MINIMAX  de  uma  matriz,  o  menor 
    elemento  da  linha  que  se  encontra  o  maior  elemento  (o  maior  número  contido  na 
    matriz)  da matriz. Observe o exemplo abaixo e  fazer um programa na linguagem Java 
    para entrar com uma matriz quadrada de ordem n e dizer qual o MINIMAX.  */

    public static void main(String[] args) throws Exception {
        
    int size;
    int lower = 0;
    int aux = 0;
    Random generator = new Random();

    size = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da Matriz"));
    int matriz[][] = new int[size][size];

    for(int y = 0; y < size; y++){
        for(int x = 0; x < size; x++){
            matriz[x][y] = generator.nextInt(10);
        }
    }

    for(int y = 0; y < size; y++){
        for(int x = 0; x < size; x++){
            if(lower < matriz[x][y]){
                aux = y;
                lower = matriz[x][y];
            }
        }
    }

    for(int x = 0; x < size; x++){
        if(lower > matriz[aux][x]){
            lower = matriz[aux][x]; 
        }
    }

    JOptionPane.showMessageDialog(null, matriz[0][0]+""+matriz[0][1]+""+matriz[0][2]+""+matriz[0][3]+"\n"+matriz[1][0]+""+matriz[1][1]+""+matriz[1][2]+""+matriz[1][3]+"\n"+matriz[2][0]+""+matriz[2][1]+""+matriz[2][2]+""+matriz[2][3]+"\n"+matriz[3][0]+""+matriz[3][1]+""+matriz[3][2]+""+matriz[3][3]);
    JOptionPane.showMessageDialog(null,"MINIMAX = " + lower);
    
    }
}