import java.util.Random;

public class App {

    /*Faça  um  algoritmo  na  linguagem  Java  que  coloque  em  ordem  crescente  um  vetor  de 
    números inteiros.  */

    public static void main(String[] args) throws Exception {
        
    /*Faça  um  algoritmo  na  linguagem  Java  que  coloque  em  ordem  crescente  um  vetor  de 
    números inteiros.*/
        
    int vetor1[] = new int[10];
    int aux;

    Random generator = new Random();
    
    for(int i = 0; i < 9; i++){
        vetor1[i] = generator.nextInt(10);
    }

    for(int i = 0; i < 5; i++){
        for(int j = 9; j >= 4  ; j--){
            if(vetor1[j] < vetor1[i]){
                aux = vetor1[j];
                vetor1[j] = vetor1[i];
                vetor1[i] = aux;
            }   
        }
    }
    for(int i=0; i<9; i++){
        System.out.println(vetor1[i]);}
    }
}