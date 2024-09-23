import java.util.Scanner;

public class App{

public static void main(String[] args) {

    /*A conversão de graus Fahrenheit para Celsius é obtida por C = 5/9*(F-32). Represente 
    um  algoritmo  de  conversão  de  graus  Fahrenheit  para  Celsius  utilizando  a  linguagem 
    Java.*/
    
    double celsius , far;
    
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Digite a temperatura em Farenheit: ");
        far = sc.nextDouble();
    }
    
    celsius = 5.0/9.0 *(far - 32);
    
    System.out.print(far + " Farenheits = " + celsius + "º Celsius");
    
    }
}