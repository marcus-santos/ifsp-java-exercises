import java.util.Scanner;

public class App {

    public static void main(String[] args) {

    /*Crie um programa na linguagem Java para calcular o valor da prestação de um imóvel 
    financiado (utilize juros simples, Fórmula: J = C × i × t, onde: J = juros simples; C = capital 
    inicial; i = taxa de juros; t = tempo da aplicação). */
        
    double c, i , j , t;
    
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Digite o Capital Inicial: ");
        c = sc.nextDouble();
        
        System.out.print("Digite a Taxa de Juros: ");
        i = sc.nextDouble();
        
        System.out.print("Digite o Tempo: ");
        t = sc.nextDouble();
    }
    
    j = c * (i/100) * t;
    System.out.print("Valor da Prestação: " + j);
    
}
}