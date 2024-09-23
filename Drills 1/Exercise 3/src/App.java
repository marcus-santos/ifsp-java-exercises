import java.util.Scanner;

public class App {

public static void main(String[] args) {
    
    /*O prêmio da loteria é dividido em três fatias: sena fica com 60%, quina fica com 30% e 
    quadra fica com 10%. Crie um programa na linguagem Java para calcular quanto cada 
    apostador ganhará. */

    double prize, sena, mega, quadra;
    
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Qual o valor do premio da loteria: ");
        prize = sc.nextDouble();
    }
    
    sena = (prize * 0.6);
    mega = (prize * 0.3);
    quadra = (prize * 0.1);
    
    
    System.out.println("Sena = " + sena + "\nMega = " + mega + "\nQuadra = " + quadra);
}
}